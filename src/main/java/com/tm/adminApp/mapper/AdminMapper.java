package com.tm.adminApp.mapper;

import com.tm.adminApp.dto.AdminDTO;
import com.tm.adminApp.dto.SaveAdminDTO;
import com.tm.adminApp.dto.UpdateAdminDTO;
import com.tm.adminApp.entity.Admin;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(
        componentModel = "spring",
        nullValuePropertyMappingStrategy = org.mapstruct.NullValuePropertyMappingStrategy.SET_TO_NULL,
        unmappedTargetPolicy = org.mapstruct.ReportingPolicy.IGNORE
)
public interface AdminMapper {
    AdminMapper INSTANCE = Mappers.getMapper(AdminMapper.class);

    Admin toEntity(AdminDTO dto);

    AdminDTO toDto(Admin entity);

    Admin updateDtoToEntity(UpdateAdminDTO updateDto);

    UpdateAdminDTO entitytoUpdateDto(Admin entity);

    Admin saveDtoToEntity(SaveAdminDTO saveDto);

    SaveAdminDTO entitytoSaveDto(Admin entity);

    List<AdminDTO> entityListToDTOList(List<Admin> entityList);

    List<Admin> dtoListToEntityList(List<AdminDTO> dtoList);
}
