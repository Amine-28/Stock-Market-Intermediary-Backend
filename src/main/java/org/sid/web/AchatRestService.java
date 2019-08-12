package org.sid.web;

import java.util.List;

import org.sid.dao.AchatRepository;
import org.sid.entities.Achat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins="http://localhost:4200",allowedHeaders="*")
public class AchatRestService {
	
	@Autowired
	private AchatRepository achatRepository;
	@RequestMapping(value="/achat",method=RequestMethod.GET)
	public List<Achat> getAchat(){
		return achatRepository.findAll();
	}
	
	@RequestMapping(value="/achat/{id}",method=RequestMethod.GET)
	public Achat getAchat(@PathVariable Long id){
		return achatRepository.findOne(id);
	}
	
	@RequestMapping(value="/achat",method=RequestMethod.POST)
	public Achat save(@RequestBody Achat c){
		return achatRepository.save(c);
	}
	
	@RequestMapping(value="/achat/{id}",method=RequestMethod.DELETE)
	public boolean supprimer(@PathVariable Long id){
		achatRepository.delete(id);
		return true;
	}
	
	@RequestMapping(value="/achat/{id}",method=RequestMethod.PUT)
	public Achat save(@PathVariable Long id,@RequestBody Achat c){
		 c.setId(id);	
		 return achatRepository.save(c);
	}
}
