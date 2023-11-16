package com.example.demo.model;

import javax.persistence.*;

@Entity
public class BancoHoras extends EntityId{
    @Column(name = "total_horas_trabalhadas",nullable = false)
    private long totalHorasTrabalhadas;

    public long getTotalHorasTrabalhadas() {
        return totalHorasTrabalhadas;
    }

    public void setTotalHorasTrabalhadas(long totalHorasTrabalhadas) {
        this.totalHorasTrabalhadas = totalHorasTrabalhadas;
    }

    @Override
    public String toString() {
        return "BancoHoras{" +
                "totalHorasTrabalhadas=" + totalHorasTrabalhadas +
                '}';
    }
}



