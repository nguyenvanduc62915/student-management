package com.example.studentmanagament.Utils;

import com.example.studentmanagament.DTO.*;
import com.example.studentmanagament.Models.*;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class ConvertRelationship {
    public AcademicAbility convertAcademicAbilityDTOToAcademicAbility(AcademicAbilityDTO academicAbilityDTO){
        AcademicAbility academicAbility = new AcademicAbility();
        academicAbility.setId(academicAbilityDTO.getAcademicAbilityId());
        academicAbility.setMinimumScore(academicAbilityDTO.getMinimumScore());
        academicAbility.setMaximumScore(academicAbilityDTO.getMaximumScore());
        academicAbility.setSubjectNotBelow(academicAbilityDTO.getSubjectNotBelow());
        academicAbility.setCreateAt(academicAbilityDTO.getCreateAt());
        academicAbility.setUpdateAt(academicAbilityDTO.getUpdateAt());
        return academicAbility;
    }

    public AcademicAbilityDTO convertAcademicAbilityToAcademicAbilityDTO(AcademicAbility academicAbility){
        AcademicAbilityDTO academicAbilityDTO = new AcademicAbilityDTO();
        academicAbilityDTO.setAcademicAbilityId(academicAbility.getId());
        academicAbilityDTO.setMinimumScore(academicAbility.getMinimumScore());
        academicAbilityDTO.setMaximumScore(academicAbility.getMaximumScore());
        academicAbilityDTO.setSubjectNotBelow(academicAbility.getSubjectNotBelow());
        academicAbilityDTO.setCreateAt(academicAbility.getCreateAt());
        academicAbilityDTO.setUpdateAt(academicAbility.getUpdateAt());
        return academicAbilityDTO;
    }

    public Allot convertAllotDTOToAllot(AllotDTO allotDTO){
        Allot allot = new Allot();
        allot.setId(allotDTO.getAllotId());
        allot.setUpdateAt(allotDTO.getUpdateAt());
        allot.setCreateAt(allotDTO.getCreateAt());
        return allot;
    }

    public AllotDTO convertAllotToAllotDTO(Allot allot){
        AllotDTO allotDTO = new AllotDTO();
        allotDTO.setAllotId(allot.getId());
        allotDTO.setUpdateAt(allot.getUpdateAt());
        allotDTO.setCreateAt(allot.getCreateAt());
        return allotDTO;
    }

    public Block convertBlockToBlockDTO(BlockDTO blockDTO){
        Block block = new Block();
        block.setId(blockDTO.getBlockId());
        block.setBlockName(blockDTO.getBlockName());
        block.setCreateAt(blockDTO.getCreateAt());
        block.setUpdateAt(blockDTO.getUpdateAt());
        return block;
    }

    public BlockDTO convertBlockDTOToBlock(Block block){
        BlockDTO blockDTO = new BlockDTO();
        blockDTO.setBlockId(block.getId());
        blockDTO.setBlockName(block.getBlockName());
        blockDTO.setCreateAt(block.getCreateAt());
        blockDTO.setUpdateAt(block.getUpdateAt());
        return blockDTO;
    }

    public Conduct convertConductToConductDTO(ConductDTO conductDTO){
        Conduct conduct = new Conduct();
        conduct.setId(conductDTO.getConductId());
        conduct.setNameOfConduct(conductDTO.getNameOfConduct());
        conduct.setCreateAt(conductDTO.getCreateAt());
        conduct.setUpdateAt(conductDTO.getUpdateAt());
        return conduct;
    }

    public ConductDTO convertConductDTOToConduct(Conduct conduct){
        ConductDTO conductDTO = new ConductDTO();
        conductDTO.setConductId(conduct.getId());
        conductDTO.setNameOfConduct(conduct.getNameOfConduct());
        conductDTO.setCreateAt(conduct.getCreateAt());
        conductDTO.setUpdateAt(conduct.getUpdateAt());
        return conductDTO;
    }

    public Grade convertGradeToGradeDTO(GradeDTO gradeDTO){
        Grade grade = new Grade();
        grade.setId(gradeDTO.getGradeId());
        grade.setGradeName(gradeDTO.getGradeName());
        grade.setNumber(gradeDTO.getNumber());
        grade.setCreateAt(gradeDTO.getCreateAt());
        grade.setUpdateAt(gradeDTO.getUpdateAt());
        return grade;
    }

    public GradeDTO convertGradeDTOToGrade(Grade grade){
        GradeDTO gradeDTO = new GradeDTO();
        gradeDTO.setGradeId(grade.getId());
        gradeDTO.setGradeName(grade.getGradeName());
        gradeDTO.setNumber(grade.getNumber());
        gradeDTO.setCreateAt(grade.getCreateAt());
        gradeDTO.setUpdateAt(grade.getUpdateAt());
        return gradeDTO;
    }

    public Layering convertLayeringToLayeringDTO(LayeringDTO layeringDTO){
        Layering layering = new Layering();
        layering.setId(layeringDTO.getLayeringId());
        layering.setCreateAt(layeringDTO.getCreateAt());
        layering.setUpdateAt(layeringDTO.getUpdateAt());
        return layering;
    }

    public LayeringDTO convertLayeringDTOToLayering(Layering layering){
        LayeringDTO layeringDTO = new LayeringDTO();
        layeringDTO.setLayeringId(layering.getId());
        layeringDTO.setCreateAt(layering.getCreateAt());
        layeringDTO.setUpdateAt(layering.getUpdateAt());
        return layeringDTO;
    }

    public Nation convertNationToNationDTO(NationDTO nationDTO){
        Nation nation = new Nation();
        nation.setId(nationDTO.getNationId());
        nation.setEthnicName(nation.getEthnicName());
        nation.setCreateAt(nationDTO.getCreateAt());
        nation.setUpdateAt(nationDTO.getUpdateAt());
        return nation;
    }

    public NationDTO convertNationDTOToNation(Nation nation){
        NationDTO nationDTO = new NationDTO();
        nationDTO.setNationId(nation.getId());
        nationDTO.setEthnicName(nation.getEthnicName());
        nationDTO.setCreateAt(nation.getCreateAt());
        nationDTO.setUpdateAt(nation.getUpdateAt());
        return nationDTO;
    }

    public Point convertPointToPointDTO(PointDTO pointDTO){
        Point point = new Point();
        point.setId(pointDTO.getPointId());
        point.setScores(pointDTO.getScores());
        point.setCreateAt(pointDTO.getCreateAt());
        point.setUpdateAt(pointDTO.getUpdateAt());
        return point;
    }

    public PointDTO convertPointDTOToPoint(Point point){
        PointDTO pointDTO = new PointDTO();
        pointDTO.setPointId(point.getId());
        pointDTO.setScores(point.getScores());
        pointDTO.setCreateAt(point.getCreateAt());
        pointDTO.setUpdateAt(point.getUpdateAt());
        return pointDTO;
    }

    public PointType convertPointTypeToPointTypeDTO(PointTypeDTO pointTypeDTO){
        PointType pointType = new PointType();
        pointType.setId(pointTypeDTO.getPointTypeId());
        pointType.setPointTypeName(pointTypeDTO.getPointTypeName());
        pointType.setCreateAt(pointTypeDTO.getCreateAt());
        pointType.setUpdateAt(pointTypeDTO.getUpdateAt());
        return pointType;
    }

    public PointTypeDTO convertPointTypeDTOToPointType(PointType pointType){
        PointTypeDTO pointTypeDTO = new PointTypeDTO();
        pointTypeDTO.setPointTypeId(pointType.getId());
        pointTypeDTO.setPointTypeName(pointType.getPointTypeName());
        pointTypeDTO.setCreateAt(pointType.getCreateAt());
        pointTypeDTO.setUpdateAt(pointType.getUpdateAt());
        return pointTypeDTO;
    }

    public Profession convertProfessionToProfessionDTO(ProfessionDTO professionDTO){
        Profession profession = new Profession();
        profession.setId(professionDTO.getProfessionId());
        profession.setProfessionName(professionDTO.getProfessionName());
        profession.setCreateAt(professionDTO.getCreateAt());
        profession.setUpdateAt(professionDTO.getUpdateAt());
        return profession;
    }

    public ProfessionDTO convertProfessionDTOToProfession(Profession profession){
        ProfessionDTO professionDTO = new ProfessionDTO();
        professionDTO.setProfessionId(profession.getId());
        professionDTO.setProfessionName(profession.getProfessionName());
        professionDTO.setCreateAt(profession.getCreateAt());
        professionDTO.setUpdateAt(profession.getUpdateAt());
        return professionDTO;
    }

    public Regulation converRegulationToRegulationDTO(RegulationDTO regulationDTO){
        Regulation regulation = new Regulation();
        regulation.setId(regulationDTO.getRegulationId());
        regulation.setPassingScore(regulationDTO.getPassingScore());
        regulation.setCreateAt(regulationDTO.getCreateAt());
        regulation.setUpdateAt(regulationDTO.getUpdateAt());
        return regulation;
    }

    public RegulationDTO converRegulationDTOToRegulation(Regulation regulation){
        RegulationDTO regulationDTO = new RegulationDTO();
        regulationDTO.setRegulationId(regulation.getId());
        regulationDTO.setPassingScore(regulation.getPassingScore());
        regulationDTO.setCreateAt(regulation.getCreateAt());
        regulationDTO.setUpdateAt(regulation.getUpdateAt());
        return regulationDTO;
    }

    public Religion convertReligionToReligionDTO(ReligionDTO religionDTO){
        Religion religion  = new Religion();
        religion.setId(religionDTO.getReligionId());
        religion.setReligiousName(religionDTO.getReligiousName());
        religion.setCreateAt(religionDTO.getCreateAt());
        religion.setUpdateAt(religionDTO.getUpdateAt());
        return religion;
    }

    public ReligionDTO convertReligionDTOToReligion(Religion religion){
        ReligionDTO religionDTO  = new ReligionDTO();
        religionDTO.setReligionId(religion.getId());
        religionDTO.setReligiousName(religion.getReligiousName());
        religionDTO.setCreateAt(religion.getCreateAt());
        religionDTO.setUpdateAt(religion.getUpdateAt());
        return religionDTO;
    }

    public Result convertResultToResultDTO(ResultDTO resultDTO){
        Result result = new Result();
        result.setId(resultDTO.getResultId());
        result.setResultName(resultDTO.getResultName());
        result.setCreateAt(resultDTO.getCreateAt());
        result.setUpdateAt(resultDTO.getUpdateAt());
        return result;
    }

    public ResultDTO convertResultDTOToResult(Result result){
        ResultDTO resultDTO = new ResultDTO();
        resultDTO.setResultId(result.getId());
        resultDTO.setResultName(result.getResultName());
        resultDTO.setCreateAt(result.getCreateAt());
        resultDTO.setUpdateAt(result.getUpdateAt());
        return resultDTO;
    }

    public ResultGradeSemester converResultGradeSemesterToResultGradeSemesterDTO(ResultGradeSemesterDTO resultGradeSemesterDTO){
        ResultGradeSemester resultGradeSemester = new ResultGradeSemester();
        resultGradeSemester.setId(resultGradeSemesterDTO.getResultGradeSemesterId());
        resultGradeSemester.setRate(resultGradeSemesterDTO.getRate());
        resultGradeSemester.setQuantityPassed(resultGradeSemesterDTO.getQuantityPassed());
        resultGradeSemester.setCreateAt(resultGradeSemesterDTO.getCreateAt());
        resultGradeSemester.setUpdateAt(resultGradeSemesterDTO.getUpdateAt());
        return resultGradeSemester;
    }

    public ResultGradeSemesterDTO converResultGradeSemesterDTOToResultGradeSemester(ResultGradeSemester resultGradeSemester){
        ResultGradeSemesterDTO resultGradeSemesterDTO = new ResultGradeSemesterDTO();
        resultGradeSemesterDTO.setResultGradeSemesterId(resultGradeSemester.getId());
        resultGradeSemesterDTO.setRate(resultGradeSemester.getRate());
        resultGradeSemesterDTO.setQuantityPassed(resultGradeSemester.getQuantityPassed());
        resultGradeSemesterDTO.setCreateAt(resultGradeSemester.getCreateAt());
        resultGradeSemesterDTO.setUpdateAt(resultGradeSemester.getUpdateAt());
        return resultGradeSemesterDTO;
    }

    public ResultGradeSubject convertResultGradeSubjectToResultGradeSubjectDTO(ResultGradeSubjectDTO resultGradeSubjectDTO){
        ResultGradeSubject resultGradeSubject = new ResultGradeSubject();
        resultGradeSubject.setId(resultGradeSubjectDTO.getResultGradeSubjectId());
        resultGradeSubject.setRate(resultGradeSubjectDTO.getRate());
        resultGradeSubject.setQuantityPassed(resultGradeSubjectDTO.getQuantityPassed());
        resultGradeSubject.setCreateAt(resultGradeSubjectDTO.getCreateAt());
        resultGradeSubject.setUpdateAt(resultGradeSubjectDTO.getUpdateAt());
        return resultGradeSubject;
    }

    public ResultGradeSubjectDTO convertResultGradeSubjectDTOToResultGradeSubject(ResultGradeSubject resultGradeSubject){
        ResultGradeSubjectDTO resultGradeSubjectDTO = new ResultGradeSubjectDTO();
        resultGradeSubjectDTO.setResultGradeSubjectId(resultGradeSubject.getId());
        resultGradeSubjectDTO.setRate(resultGradeSubject.getRate());
        resultGradeSubjectDTO.setQuantityPassed(resultGradeSubject.getQuantityPassed());
        resultGradeSubjectDTO.setCreateAt(resultGradeSubject.getCreateAt());
        resultGradeSubjectDTO.setUpdateAt(resultGradeSubject.getUpdateAt());
        return resultGradeSubjectDTO;
    }

    public ResultStudentAllYear convertResultStudentAllYearToResultStudentAllYearDTO(ResultStudentAllYearDTO resultStudentAllYearDTO){
        ResultStudentAllYear resultStudentAllYear = new ResultStudentAllYear();
        resultStudentAllYear.setId(resultStudentAllYearDTO.getResultStudentAllYearId());
        resultStudentAllYear.setSemesterAllYearGPA(resultStudentAllYearDTO.getSemesterAllYearGPA());
        resultStudentAllYear.setSemesterOneGPA(resultStudentAllYearDTO.getSemesterOneGPA());
        resultStudentAllYear.setSemesterTwoGPA(resultStudentAllYearDTO.getSemesterTwoGPA());
        resultStudentAllYear.setCreateAt(resultStudentAllYearDTO.getUpdateAt());
        resultStudentAllYear.setUpdateAt(resultStudentAllYearDTO.getUpdateAt());
        return resultStudentAllYear;
    }

    public ResultStudentAllYearDTO convertResultStudentAllYearDTOToResultStudentAllYear(ResultStudentAllYear resultStudentAllYear){
        ResultStudentAllYearDTO resultStudentAllYearDTO = new ResultStudentAllYearDTO();
        resultStudentAllYearDTO.setResultStudentAllYearId(resultStudentAllYear.getId());
        resultStudentAllYearDTO.setSemesterAllYearGPA(resultStudentAllYear.getSemesterAllYearGPA());
        resultStudentAllYearDTO.setSemesterOneGPA(resultStudentAllYear.getSemesterOneGPA());
        resultStudentAllYearDTO.setSemesterTwoGPA(resultStudentAllYear.getSemesterTwoGPA());
        resultStudentAllYearDTO.setCreateAt(resultStudentAllYear.getUpdateAt());
        resultStudentAllYearDTO.setUpdateAt(resultStudentAllYear.getUpdateAt());
        return resultStudentAllYearDTO;
    }

    public ResultStudentSubject convertResultStudentSubjectToResultStudentSubjectDTO(ResultStudentSubjectDTO resultStudentSubjectDTO){
        ResultStudentSubject resultStudentSubject = new ResultStudentSubject();
        resultStudentSubject.setId(resultStudentSubjectDTO.getResultStudentSubjectId());
        resultStudentSubject.setExamScores(resultStudentSubjectDTO.getExamScores());
        resultStudentSubject.setMinute15GPA(resultStudentSubjectDTO.getMinute15GPA());
        resultStudentSubject.setMinute45GPA(resultStudentSubjectDTO.getMinute45GPA());
        resultStudentSubject.setOralGPA(resultStudentSubjectDTO.getOralGPA());
        resultStudentSubject.setSemesterGPA(resultStudentSubjectDTO.getSemesterGPA());
        resultStudentSubject.setCreateAt(resultStudentSubjectDTO.getCreateAt());
        resultStudentSubject.setUpdateAt(resultStudentSubjectDTO.getUpdateAt());
        return resultStudentSubject;
    }

    public SchoolYear convertSchoolYeartToSchoolYearDTO(SchoolYearDTO schoolYearDTO){
        SchoolYear schoolYear = new SchoolYear();
        schoolYear.setId(schoolYearDTO.getSchoolYearId());
        schoolYear.setNameOfSchoolYear(schoolYearDTO.getNameOfSchoolYear());
        schoolYear.setCreateAt(schoolYearDTO.getCreateAt());
        schoolYear.setUpdateAt(schoolYearDTO.getUpdateAt());
        return schoolYear;
    }

    public SchoolYearDTO convertSchoolYeartDTOToSchoolYear(SchoolYear schoolYear){
        SchoolYearDTO schoolYearDTO = new SchoolYearDTO();
        schoolYearDTO.setSchoolYearId(schoolYear.getId());
        schoolYearDTO.setNameOfSchoolYear(schoolYear.getNameOfSchoolYear());
        schoolYearDTO.setCreateAt(schoolYear.getCreateAt());
        schoolYearDTO.setUpdateAt(schoolYear.getUpdateAt());
        return schoolYearDTO;
    }

    public Semester convertSemesterToSemesterDTO(SemesterDTO semesterDTO){
        Semester semester = new Semester();
        semester.setId(semesterDTO.getSemesterId());
        semester.setSemesterName(semesterDTO.getSemesterName());
        semester.setCoefficient(semesterDTO.getSemesterName());
        semester.setCreateAt(semesterDTO.getCreateAt());
        semester.setUpdateAt(semesterDTO.getUpdateAt());
        return semester;
    }

    public SemesterDTO convertSemesterDTOToSemester(Semester semester){
        SemesterDTO semesterDTO = new SemesterDTO();
        semesterDTO.setSemesterId(semester.getId());
        semesterDTO.setSemesterName(semester.getSemesterName());
        semesterDTO.setCoefficient(semester.getSemesterName());
        semesterDTO.setCreateAt(semester.getCreateAt());
        semesterDTO.setUpdateAt(semester.getUpdateAt());
        return semesterDTO;
    }

    public Student convertStudentToStudentDTO(StudentDTO studentDTO){
        Student student = new Student();
        student.setId(studentDTO.getStudentId());
        student.setAddress(studentDTO.getAddress());
        student.setEmail(studentDTO.getEmail());
        student.setDateOfBirth(studentDTO.getDateOfBirth());
        student.setFatherIsFullName(studentDTO.getFatherIsFullName());
        student.setMotherIsFullName(studentDTO.getMotherIsFullName());
        student.setFirstName(studentDTO.getFirstName());
        student.setLastName(studentDTO.getLastName());
        student.setCreateAt(studentDTO.getCreateAt());
        student.setUpdateAt(studentDTO.getUpdateAt());
        return student;
    }

    public StudentDTO convertStudentDTOToStudent(Student student){
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setStudentId(student.getId());
        studentDTO.setAddress(student.getAddress());
        studentDTO.setEmail(student.getEmail());
        studentDTO.setDateOfBirth(student.getDateOfBirth());
        studentDTO.setFatherIsFullName(student.getFatherIsFullName());
        studentDTO.setMotherIsFullName(student.getMotherIsFullName());
        studentDTO.setFirstName(student.getFirstName());
        studentDTO.setLastName(student.getLastName());
        studentDTO.setCreateAt(student.getCreateAt());
        studentDTO.setUpdateAt(student.getUpdateAt());
        return studentDTO;
    }

    public Subject convertSubjectToSubjectDTO(SubjectDTO subjectDTO){
        Subject subject = new Subject();
        subject.setId(subjectDTO.getSubjectId());
        subject.setSubjectName(subjectDTO.getSubjectName());
        subject.setNumberOfPriods(subjectDTO.getNumberOfPriods());
        subject.setCreateAt(subjectDTO.getCreateAt());
        subject.setUpdateAt(subjectDTO.getUpdateAt());
        return subject;
    }

    public SubjectDTO convertSubjectDTOToSubject(Subject subject){
        SubjectDTO subjectDTO = new SubjectDTO();
        subjectDTO.setSubjectId(subject.getId());
        subjectDTO.setSubjectName(subject.getSubjectName());
        subjectDTO.setNumberOfPriods(subject.getNumberOfPriods());
        subjectDTO.setCreateAt(subject.getCreateAt());
        subjectDTO.setUpdateAt(subject.getUpdateAt());
        return subjectDTO;
    }

    public Teacher convertTeacherToTeacherDTO(TeacherDTO teacherDTO){
        Teacher teacher = new Teacher();
        teacher.setId(teacherDTO.getTeacherId());
        teacher.setAddress(teacherDTO.getAddress());
        teacher.setEmail(teacherDTO.getEmail());
        teacher.setTeacherName(teacherDTO.getTeacherName());
        teacher.setPhoneNumber(teacherDTO.getPhoneNumber());
        teacher.setCreateAt(teacherDTO.getCreateAt());
        teacher.setUpdateAt(teacherDTO.getUpdateAt());
        return teacher;
    }

    public TeacherDTO convertTeacherDTOToTeacher(Teacher teacher){
        TeacherDTO teacherDTO = new TeacherDTO();
        teacherDTO.setTeacherId(teacher.getId());
        teacherDTO.setAddress(teacher.getAddress());
        teacherDTO.setEmail(teacher.getEmail());
        teacherDTO.setTeacherName(teacher.getTeacherName());
        teacherDTO.setPhoneNumber(teacher.getPhoneNumber());
        teacherDTO.setCreateAt(teacher.getCreateAt());
        teacherDTO.setUpdateAt(teacher.getUpdateAt());
        return teacherDTO;
    }

    public User convertUserToUserDTO(UserDTO userDTO){
        User user = new User();
        user.setId(userDTO.getUserId());
        user.setUsername(userDTO.getUsername());
        user.setPassword(userDTO.getPassword());
        user.setFisrtName(userDTO.getFisrtName());
        user.setLastName(userDTO.getLastName());
        user.setAddress(userDTO.getAddress());
        user.setCreateAt(userDTO.getCreateAt());
        user.setUpdateAt(userDTO.getUpdateAt());
        return user;
    }

    public UserDTO convertUserDTOToUser(User user){
        UserDTO userDTO = new UserDTO();
        userDTO.setUserId(user.getId());
        userDTO.setUsername(user.getUsername());
        userDTO.setPassword(user.getPassword());
        userDTO.setFisrtName(user.getFisrtName());
        userDTO.setLastName(user.getLastName());
        userDTO.setAddress(user.getAddress());
        userDTO.setCreateAt(user.getCreateAt());
        userDTO.setUpdateAt(user.getUpdateAt());
        return userDTO;
    }
}
