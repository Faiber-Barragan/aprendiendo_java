/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.faiber.modelo;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("director")
public class Director {
    
    @Id
    private int dir_id;
    private String dir_nombre;
    private String dir_apellido;
    private String dir_nacionalidad;
}
