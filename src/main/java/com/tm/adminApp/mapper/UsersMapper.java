package com.tm.adminApp.mapper;

import com.tm.adminApp.dto.SaveUsersDTO;
import com.tm.adminApp.dto.UpdateUsersDTO;
import com.tm.adminApp.dto.UsersDTO;
import com.tm.adminApp.entity.Users;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(
        componentModel = "spring",
        nullValuePropertyMappingStrategy = org.mapstruct.NullValuePropertyMappingStrategy.SET_TO_NULL,
        unmappedTargetPolicy = org.mapstruct.ReportingPolicy.IGNORE
)
public interface UsersMapper {
    UsersMapper INSTANCE = Mappers.getMapper(UsersMapper.class);

    Users toEntity(UsersDTO dto);

    UsersDTO toDto(Users entity);

    Users updateDtoToEntity(UpdateUsersDTO updateDto);

    UpdateUsersDTO entitytoUpdateDto(Users entity);

    Users saveDtoToEntity(SaveUsersDTO saveDto);

    SaveUsersDTO entitytoSaveDto(Users entity);

    List<UsersDTO> entityListToDTOList(List<Users> entityList);

    List<Users> dtoListToEntityList(List<UsersDTO> dtoList);
}
