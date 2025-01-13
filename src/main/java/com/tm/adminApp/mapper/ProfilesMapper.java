package com.tm.adminApp.mapper;

import com.tm.adminApp.dto.ProfilesDTO;
import com.tm.adminApp.dto.SaveProfilesDTO;
import com.tm.adminApp.dto.UpdateProfilesDTO;
import com.tm.adminApp.entity.Profiles;
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
public interface ProfilesMapper {
    ProfilesMapper INSTANCE = Mappers.getMapper(ProfilesMapper.class);

    Profiles toEntity(ProfilesDTO dto);

    ProfilesDTO toDto(Profiles entity);

    @Mapping(
            target = "id",
            ignore = true
    )
    Profiles updateDtoToEntity(UpdateProfilesDTO updateDto, @MappingTarget Profiles entity);

    UpdateProfilesDTO entitytoUpdateDto(Profiles entity);

    Profiles saveDtoToEntity(SaveProfilesDTO saveDto);

    SaveProfilesDTO entitytoSaveDto(Profiles entity);

    List<ProfilesDTO> entityListToDTOList(List<Profiles> entityList);

    List<Profiles> dtoListToEntityList(List<ProfilesDTO> dtoList);
}
