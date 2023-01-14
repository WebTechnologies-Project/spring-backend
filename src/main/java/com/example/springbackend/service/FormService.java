package com.example.springbackend.service;
import com.example.springbackend.assets.Form;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.springbackend.repository.FormRepository;

//import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional

public class FormService {

        @Autowired
        private FormRepository formRepository;
        public List<Form> listAllForms() {
            return formRepository.findAll();
        }

        public void saveForm(Form form) {
            formRepository.save(form);
        }

        public Form getForm(Integer id) {
            return formRepository.findById(id).get();
        }

        public void deleteForm(Integer id) {
            formRepository.deleteById(id);
        }
}
