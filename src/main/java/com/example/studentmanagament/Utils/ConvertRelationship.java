package com.example.studentmanagament.Utils;

import com.example.studentmanagament.DTO.AcademicAbilityDTO;
import com.example.studentmanagament.Models.AcademicAbility;
import org.springframework.stereotype.Component;

@Component
public class ConvertRelationship {
    public AcademicAbility convertAcademicAbilityDTOToAcademicAbility(AcademicAbilityDTO academicAbilityDTO){
        AcademicAbility academicAbility = new AcademicAbility();
        academicAbility.setId(academicAbilityDTO.getAcademicAbilityId());
        academicAbility.setMinimumScore(academicAbilityDTO.getMinimumScore());
        academicAbility.setMaximumScore(academicAbilityDTO.getMaximumScore());
        academicAbility.setSubjectNotBelow(academicAbilityDTO.getSubjectNotBelow());
        academicAbility.setCreateAt(academicAbilityDTO.getCreateAt());
        academicAbility.setUpdateAt(academicAbilityDTO.getUpdateAt());
        return academicAbility;
    }

    public AcademicAbilityDTO convertAcademicAbilityToAcademicAbilityDTO(AcademicAbility academicAbility){
        AcademicAbilityDTO academicAbilityDTO = new AcademicAbilityDTO();
        academicAbilityDTO.setAcademicAbilityId(academicAbility.getId());
        academicAbilityDTO.setMinimumScore(academicAbility.getMinimumScore());
        academicAbilityDTO.setMaximumScore(academicAbility.getMaximumScore());
        academicAbilityDTO.setSubjectNotBelow(academicAbility.getSubjectNotBelow());
        academicAbilityDTO.setCreateAt(academicAbility.getCreateAt());
        academicAbilityDTO.setUpdateAt(academicAbility.getUpdateAt());
        return academicAbilityDTO;
    }
}