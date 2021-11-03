package com.surveybuilder.service;


import java.util.List;
import java.util.Optional;

import com.surveybuilder.entities.Admin;
import com.surveybuilder.entities.Feedback;
import com.surveybuilder.entities.Responses;
import com.surveybuilder.entities.Surveyor;

public interface AdminService {
	
	public void createAdmin(Admin admin);
	public void createSurveyor(Surveyor surveyor);
	public List<Responses> findAllById(int respondentId);
	
	public Optional<Feedback> viewFeedback(int feedbackId);

}
