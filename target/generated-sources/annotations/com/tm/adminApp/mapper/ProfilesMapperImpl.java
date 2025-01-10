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
    date = "2025-01-10T15:59:23+0530",
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

        profiles.setId( dto.getId() );
        profiles.setUsers( usersDTOToUsers( dto.getUsers() ) );
        profiles.setBio( dto.getBio() );

        return profiles;
    }

    @Override
    public ProfilesDTO toDto(Profiles entity) {
        if ( entity == null ) {
            return null;
        }

        ProfilesDTO profilesDTO = new ProfilesDTO();

        profilesDTO.setId( entity.getId() );
        profilesDTO.setUsers( usersToUsersDTO( entity.getUsers() ) );
        profilesDTO.setBio( entity.getBio() );

        return profilesDTO;
    }

    @Override
    public Profiles updateDtoToEntity(UpdateProfilesDTO updateDto) {
        if ( updateDto == null ) {
            return null;
        }

        Profiles profiles = new Profiles();

        profiles.setId( updateDto.getId() );
        profiles.setBio( updateDto.getBio() );

        return profiles;
    }

    @Override
    public UpdateProfilesDTO entitytoUpdateDto(Profiles entity) {
        if ( entity == null ) {
            return null;
        }

        UpdateProfilesDTO updateProfilesDTO = new UpdateProfilesDTO();

        updateProfilesDTO.setId( entity.getId() );
        updateProfilesDTO.setBio( entity.getBio() );

        return updateProfilesDTO;
    }

    @Override
    public Profiles saveDtoToEntity(SaveProfilesDTO saveDto) {
        if ( saveDto == null ) {
            return null;
        }

        Profiles profiles = new Profiles();

        profiles.setBio( saveDto.getBio() );

        return profiles;
    }

    @Override
    public SaveProfilesDTO entitytoSaveDto(Profiles entity) {
        if ( entity == null ) {
            return null;
        }

        SaveProfilesDTO saveProfilesDTO = new SaveProfilesDTO();

        saveProfilesDTO.setBio( entity.getBio() );

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

        users.setId( usersDTO.getId() );
        users.setName( usersDTO.getName() );
        users.setEmail( usersDTO.getEmail() );

        return users;
    }

    protected UsersDTO usersToUsersDTO(Users users) {
        if ( users == null ) {
            return null;
        }

        UsersDTO usersDTO = new UsersDTO();

        usersDTO.setId( users.getId() );
        usersDTO.setName( users.getName() );
        usersDTO.setEmail( users.getEmail() );

        return usersDTO;
    }
}
