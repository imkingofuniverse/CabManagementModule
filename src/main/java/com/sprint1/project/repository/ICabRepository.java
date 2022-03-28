package com.sprint1.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sprint1.project.entity.Cab;


/*/*****************************************************************************
 * ICab Repository Class 
 *
 * Created By: Sri Sai Resu
 * Date:18/03/2022 
 *******************************************************************************/


public interface ICabRepository extends JpaRepository<Cab, String> {

}