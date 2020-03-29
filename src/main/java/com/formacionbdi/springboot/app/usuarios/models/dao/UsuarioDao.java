package com.formacionbdi.springboot.app.usuarios.models.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.formacionbdi.springboot.app.usuarios.models.entity.Usuario;

/*Anotacion que permite implementar el Crud completo de forma automatica, este componente de Spring lo que hace
 * es exportar el CrudRepository a un endPoint en la APIrest sin tener que escribir codigo del controlador ni las clases services
 * path, se especifica el endPoint donde se va exportar el CrudRepositori, todo los metdos de Crud y
 * tambien los metodos personalizados que se tenga, todo se exporta a la APIrest de forma automatica*/
@RepositoryRestResource(path="usuarios")
/*lo que se quiere es heradar de crudRepository, pero si extendemos de PagingAndSortingRepository,
 * tambien estaremos heredando CrudRepository y ademas que provee de mas funcionalidades como
 * paginacion y sort*/
public interface UsuarioDao extends PagingAndSortingRepository<Usuario, Long>{

	public Usuario findByUsername(String username);
	
	@Query("select u from Usuario u where u.username=?1")
	public Usuario obtenerPorUsername(String username);
	
	
}
