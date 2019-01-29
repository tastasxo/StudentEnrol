package com.enrol

class Course {
	String department;
	String courseTitle;
	String courseLeader;
	String courseCode;
	Date startDate;
	Date endDate;
	String description;
	int numberOfStudents;
	double tuitionFees;
	String studyMode;

    static constraints = {
	courseTitle blank:false
	department blank:false
	courseLeader blank:false
	courseCode blank:false
	numberOfStudents blank:false, min:20, max:60
	startDate blank:false
	endDate blank:false
	studyMode blank:false, maxSize:20
	description blank:false, maxSize:5000
	tuitionFees blank:false, scale:3
	
    }
}
