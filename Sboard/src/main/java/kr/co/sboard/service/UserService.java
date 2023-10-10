package kr.co.sboard.service;

import kr.co.sboard.dto.TermsDTO;
import kr.co.sboard.entity.TermsEntity;
import kr.co.sboard.repository.TermsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private TermsRepository termsRepository;

    public TermsDTO findByTerms(){
        Optional<TermsEntity> result = termsRepository.findById(1);
        return result.get().toDTO();
    }
}
