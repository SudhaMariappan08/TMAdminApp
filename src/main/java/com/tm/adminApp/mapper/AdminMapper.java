package com.tm.adminApp.mapper;

import com.tm.adminApp.dto.AdminDTO;
import com.tm.adminApp.dto.SaveAdminDTO;
import com.tm.adminApp.dto.UpdateAdminDTO;
import com.tm.adminApp.entity.Admin;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper(
        componentModel = "spring",
        nullValueCheckStrategy = org.mapstruct.NullValueCheckStrategy.ALWAYS,
        nullValuePropertyMappingStrategy = org.mapstruct.NullValuePropertyMappingStrategy.IGNORE,
        unmappedTargetPolicy = org.mapstruct.ReportingPolicy.IGNORE
)
public interface AdminMapper {
    AdminMapper INSTANCE = Mappers.getMapper(AdminMapper.class);

    Admin toEntity(AdminDTO dto);

    AdminDTO toDto(Admin entity);

    @Mapping(
            target = "id",
            ignore = true
    )
    Admin updateDtoToEntity(UpdateAdminDTO updateDto, @MappingTarget Admin entity);

    UpdateAdminDTO entitytoUpdateDto(Admin entity);

    Admin saveDtoToEntity(SaveAdminDTO saveDto);

    SaveAdminDTO entitytoSaveDto(Admin entity);

    List<AdminDTO> entityListToDTOList(List<Admin> entityList);

    List<Admin> dtoListToEntityList(List<AdminDTO> dtoList);
}
