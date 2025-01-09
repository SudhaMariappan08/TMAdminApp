package com.tm.adminApp.mapper;

import com.tm.adminApp.dto.ProfilesDTO;
import com.tm.adminApp.dto.SaveProfilesDTO;
import com.tm.adminApp.dto.UpdateProfilesDTO;
import com.tm.adminApp.entity.Profiles;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(
        componentModel = "spring",
        nullValuePropertyMappingStrategy = org.mapstruct.NullValuePropertyMappingStrategy.SET_TO_NULL,
        unmappedTargetPolicy = org.mapstruct.ReportingPolicy.IGNORE
)
public interface ProfilesMapper {
    ProfilesMapper INSTANCE = Mappers.getMapper(ProfilesMapper.class);

    Profiles toEntity(ProfilesDTO dto);

    ProfilesDTO toDto(Profiles entity);

    Profiles updateDtoToEntity(UpdateProfilesDTO updateDto);

    UpdateProfilesDTO entitytoUpdateDto(Profiles entity);

    Profiles saveDtoToEntity(SaveProfilesDTO saveDto);

    SaveProfilesDTO entitytoSaveDto(Profiles entity);

    List<ProfilesDTO> entityListToDTOList(List<Profiles> entityList);

    List<Profiles> dtoListToEntityList(List<ProfilesDTO> dtoList);
}
