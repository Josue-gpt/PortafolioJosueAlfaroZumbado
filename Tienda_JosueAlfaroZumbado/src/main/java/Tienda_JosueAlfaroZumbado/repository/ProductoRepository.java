/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Tienda_JosueAlfaroZumbado.repository;

import Tienda_JosueAlfaroZumbado.domain.Producto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {
    
    // Método personalizado para obtener solo las categorías activas
    public List<Producto> findByActivoTrue();
}

