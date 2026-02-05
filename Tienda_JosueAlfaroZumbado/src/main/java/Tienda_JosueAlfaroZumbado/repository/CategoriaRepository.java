/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Tienda_JosueAlfaroZumbado.repository;

import Tienda_JosueAlfaroZumbado.domain.Categoria;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
    
    // Método personalizado para obtener solo las categorías activas
    public List<Categoria> findByActivoTrue();
}

