package com.example.Inheritance_Joined_Table.Repository;

import com.example.Inheritance_Joined_Table.Entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car,Integer>
{
}
