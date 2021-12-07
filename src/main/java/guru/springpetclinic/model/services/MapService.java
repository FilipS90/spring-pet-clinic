package guru.springpetclinic.model.services;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapService<T, ID> extends MutableCrudService<T,ID>{
	
	protected Map<ID, T> map = new HashMap<>();
	
	protected Set<T> findAll(){
		return new HashSet<>(map.values());
	}
	
	protected T findById(ID id) {
		return map.get(id);
	}
	
	protected void save(ID id, T element) {
		map.put(id, element);
	}
	
	protected void deleteById(ID id) {
		map.remove(id);
	}
	
	protected void delete(T element) {
		map.entrySet().removeIf(x -> x.getValue().equals(element));
	}
}
