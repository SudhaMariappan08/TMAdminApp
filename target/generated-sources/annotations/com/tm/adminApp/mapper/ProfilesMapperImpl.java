package com.tm.adminApp.mapper;

import com.tm.adminApp.dto.ProfilesDTO;
import com.tm.adminApp.dto.SaveProfilesDTO;
import com.tm.adminApp.dto.UpdateProfilesDTO;
import com.tm.adminApp.dto.UsersDTO;
import com.tm.adminApp.entity.Profiles;
import com.tm.adminApp.entity.Users;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-01-16T12:02:05+0530",
    comments = "version: 1.6.3, compiler: Eclipse JDT (IDE) 1.4.0.v20210708-0430, environment: Java 17 (Eclipse Adoptium)"
)
@Component
public class ProfilesMapperImpl implements ProfilesMapper {

    @Override
    public Profiles toEntity(ProfilesDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Profiles profiles = new Profiles();

        if ( dto.getId() != null ) {
            profiles.setId( dto.getId() );
        }
        if ( dto.getUsers() != null ) {
            profiles.setUsers( usersDTOToUsers( dto.getUsers() ) );
        }
        if ( dto.getBio() != null ) {
            profiles.setBio( dto.getBio() );
        }

        return profiles;
    }

    @Override
    public ProfilesDTO toDto(Profiles entity) {
        if ( entity == null ) {
            return null;
        }

        ProfilesDTO profilesDTO = new ProfilesDTO();

        if ( entity.getId() != null ) {
            profilesDTO.setId( entity.getId() );
        }
        if ( entity.getUsers() != null ) {
            profilesDTO.setUsers( usersToUsersDTO( entity.getUsers() ) );
        }
        if ( entity.getBio() != null ) {
            profilesDTO.setBio( entity.getBio() );
        }

        return profilesDTO;
    }

    @Override
    public Profiles updateDtoToEntity(UpdateProfilesDTO updateDto, Profiles entity) {
        if ( updateDto == null ) {
            return entity;
        }

        if ( updateDto.getBio() != null ) {
            entity.setBio( updateDto.getBio() );
        }

        return entity;
    }

    @Override
    public UpdateProfilesDTO entitytoUpdateDto(Profiles entity) {
        if ( entity == null ) {
            return null;
        }

        UpdateProfilesDTO updateProfilesDTO = new UpdateProfilesDTO();

        if ( entity.getId() != null ) {
            updateProfilesDTO.setId( entity.getId() );
        }
        if ( entity.getBio() != null ) {
            updateProfilesDTO.setBio( entity.getBio() );
        }

        return updateProfilesDTO;
    }

    @Override
    public Profiles saveDtoToEntity(SaveProfilesDTO saveDto) {
        if ( saveDto == null ) {
            return null;
        }

        Profiles profiles = new Profiles();

        if ( saveDto.getBio() != null ) {
            profiles.setBio( saveDto.getBio() );
        }

        return profiles;
    }

    @Override
    public SaveProfilesDTO entitytoSaveDto(Profiles entity) {
        if ( entity == null ) {
            return null;
        }

        SaveProfilesDTO saveProfilesDTO = new SaveProfilesDTO();

        if ( entity.getBio() != null ) {
            saveProfilesDTO.setBio( entity.getBio() );
        }

        return saveProfilesDTO;
    }

    @Override
    public List<ProfilesDTO> entityListToDTOList(List<Profiles> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<ProfilesDTO> list = new ArrayList<ProfilesDTO>( entityList.size() );
        for ( Profiles profiles : entityList ) {
            list.add( toDto( profiles ) );
        }

        return list;
    }

    @Override
    public List<Profiles> dtoListToEntityList(List<ProfilesDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Profiles> list = new ArrayList<Profiles>( dtoList.size() );
        for ( ProfilesDTO profilesDTO : dtoList ) {
            list.add( toEntity( profilesDTO ) );
        }

        return list;
    }

    protected Users usersDTOToUsers(UsersDTO usersDTO) {
        if ( usersDTO == null ) {
            return null;
        }

        Users users = new Users();

        if ( usersDTO.getId() != null ) {
            users.setId( usersDTO.getId() );
        }
        if ( usersDTO.getName() != null ) {
            users.setName( usersDTO.getName() );
        }
        if ( usersDTO.getEmail() != null ) {
            users.setEmail( usersDTO.getEmail() );
        }
        if ( usersDTO.getIsDeleted() != null ) {
            users.setIsDeleted( usersDTO.getIsDeleted() );
        }
        if ( usersDTO.getCreatedBy() != null ) {
            users.setCreatedBy( usersDTO.getCreatedBy() );
        }
        if ( usersDTO.getCreatedAt() != null ) {
            users.setCreatedAt( usersDTO.getCreatedAt() );
        }
        if ( usersDTO.getUpdatedBy() != null ) {
            users.setUpdatedBy( usersDTO.getUpdatedBy() );
        }
        if ( usersDTO.getUpdatedAt() != null ) {
            users.setUpdatedAt( usersDTO.getUpdatedAt() );
        }

        return users;
    }

    protected UsersDTO usersToUsersDTO(Users users) {
        if ( users == null ) {
            return null;
        }

        UsersDTO usersDTO = new UsersDTO();

        if ( users.getId() != null ) {
            usersDTO.setId( users.getId() );
        }
        if ( users.getName() != null ) {
            usersDTO.setName( users.getName() );
        }
        if ( users.getEmail() != null ) {
            usersDTO.setEmail( users.getEmail() );
        }
        if ( users.getIsDeleted() != null ) {
            usersDTO.setIsDeleted( users.getIsDeleted() );
        }
        if ( users.getCreatedBy() != null ) {
            usersDTO.setCreatedBy( users.getCreatedBy() );
        }
        if ( users.getCreatedAt() != null ) {
            usersDTO.setCreatedAt( users.getCreatedAt() );
        }
        if ( users.getUpdatedBy() != null ) {
            usersDTO.setUpdatedBy( users.getUpdatedBy() );
        }
        if ( users.getUpdatedAt() != null ) {
            usersDTO.setUpdatedAt( users.getUpdatedAt() );
        }

        return usersDTO;
    }
}
