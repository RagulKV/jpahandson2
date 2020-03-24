package com.ragul.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ragul.model.Skill;
import com.ragul.repository.SkillRepository;

@Service
public class SkillService {

	@Autowired
	private SkillRepository sr;

	@Transactional
	public void save(Skill s) {
		sr.save(s);
	}
	@Transactional
	public Skill get(Integer i) {
		return sr.findById(i).get();
	}
}
