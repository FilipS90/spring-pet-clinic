package guru.springpetclinic.model.services;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import guru.springpetclinic.model.BaseEntity;

@Service
@Scope("prototype")
public class MapService<T extends BaseEntity> extends MutableCrudService<T>{
	
	protected Map<Long, T> map = new HashMap<>();
	
	protected Set<T> findAll(){
		return new HashSet<>(map.values());
	}
	
	protected T findById(Long id) {
		return map.get(id);
	}
	
	protected void save(T element) {
		if(element == null)
			return;
		
		long id = getNewId();
		element.setId(id);
		map.put(id, element);
	}
	
	protected void deleteById(Long id) {
		map.remove(id);
	}
	
	protected void delete(T element) {
		map.entrySet().removeIf(x -> x.getValue().equals(element));
	}
	
	protected void printAll() {
		for(Long id : map.keySet()) {
			System.out.println("Key " + id + " - " + map.get(id));
		}
	}
	
	private Long getNewId() {
		return map.size() == 0 ? 1L : Collections.max(map.keySet()) + 1;
	}
}
