package yy.project.YOYO.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import yy.project.YOYO.domain.UserTeam;
import yy.project.YOYO.repository.UserTeamRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserTeamServiceImpl implements UserTeamService{
    private final UserTeamRepository userTeamRepository;

    public UserTeam save(UserTeam userTeam){
        return userTeamRepository.save(userTeam);
    }

    public void deleteByUID(Long uid){
        userTeamRepository.deleteByUID(uid);
    };
    public void deleteByTID(Long tid){
        userTeamRepository.deleteByTID(tid);
    };

    public List<UserTeam> findByUID(Long uid){
       return userTeamRepository.findByUID(uid);
    }
    public List<UserTeam> findByTID(Long tid){ return userTeamRepository.findByTID(tid); }

    public UserTeam findByUIDAndTID(Long uId, Long tId){
        return userTeamRepository.findByUIDAndTID(uId,tId);
    }
}
