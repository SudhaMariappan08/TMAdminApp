package com.tm.adminApp.mapper;

import com.tm.adminApp.dto.SaveUsersDTO;
import com.tm.adminApp.dto.UpdateUsersDTO;
import com.tm.adminApp.dto.UsersDTO;
import com.tm.adminApp.entity.Users;
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
public interface UsersMapper {
    UsersMapper INSTANCE = Mappers.getMapper(UsersMapper.class);

    Users toEntity(UsersDTO dto);

    UsersDTO toDto(Users entity);

    @Mapping(
            target = "id",
            ignore = true
    )
    Users updateDtoToEntity(UpdateUsersDTO updateDto, @MappingTarget Users entity);

    UpdateUsersDTO entitytoUpdateDto(Users entity);

    Users saveDtoToEntity(SaveUsersDTO saveDto);

    SaveUsersDTO entitytoSaveDto(Users entity);

    List<UsersDTO> entityListToDTOList(List<Users> entityList);

    List<Users> dtoListToEntityList(List<UsersDTO> dtoList);
}
