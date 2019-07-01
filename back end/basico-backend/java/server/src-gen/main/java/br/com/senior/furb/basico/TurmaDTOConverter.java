/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;

import org.modelmapper.Converter;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;

import br.com.senior.custom.ConversionContext;
import br.com.senior.custom.ConvertedObjectCondition;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;

import br.com.senior.custom.EntityDTOConverter;

@Component("furb.basico.TurmaDTOConverter")
@Lazy
public class TurmaDTOConverter extends EntityDTOConverter {

	@Autowired
	private MateriaDTOConverter materiaConverter;
	@Autowired
	private ProfessorDTOConverter professorConverter;
	@Autowired
	private AlunoDTOConverter alunoConverter;

	@Override
	public void setupMapperToEntity(ModelMapper mapper, ConversionContext conversionContext) {
		Converter<Materia, MateriaEntity> materiaConverter = new ContextualizedConverter<Materia, MateriaEntity>() {
			@Override
			public MateriaEntity convert(Materia source) {
				return toEntity(source, MateriaEntity.class, conversionContext);
			}
		};
		Converter<Professor, ProfessorEntity> professorConverter = new ContextualizedConverter<Professor, ProfessorEntity>() {
			@Override
			public ProfessorEntity convert(Professor source) {
				return toEntity(source, ProfessorEntity.class, conversionContext);
			}
		};
		Converter <List<Aluno>, List<AlunoEntity>> alunosConverter = new ContextualizedConverter<List<Aluno>, List<AlunoEntity>>() {
			@Override
			public List<AlunoEntity> convert(List<Aluno> source) {
				if (source == null) {
					return Collections.emptyList();
				}
				return source.stream().map(d -> toEntity(d, AlunoEntity.class, conversionContext)).collect(Collectors.toList());
			}
		};

		PropertyMap<Turma, TurmaEntity> turmaMap = new PropertyMap<Turma, TurmaEntity>() {
			@Override
			protected void configure() {
				using(materiaConverter).map(source.materia).setMateria(null);
				using(professorConverter).map(source.professor).setProfessor(null);
				using(alunosConverter).map(source.alunos).setAlunos(null);
			}
		};
		mapper.addMappings(turmaMap);
		if (mapper.getTypeMap(Materia.class, MateriaEntity.class) == null) {
			this.materiaConverter.setupMapperToEntity(mapper, conversionContext);
		}
		if (mapper.getTypeMap(Professor.class, ProfessorEntity.class) == null) {
			this.professorConverter.setupMapperToEntity(mapper, conversionContext);
		}
		if (mapper.getTypeMap(Aluno.class, AlunoEntity.class) == null) {
			this.alunoConverter.setupMapperToEntity(mapper, conversionContext);
		}
		mapper.getTypeMap(Turma.class, TurmaEntity.class).setPropertyCondition(new ConvertedObjectCondition(conversionContext));
	}

	@Override
	public void setupMapperToDTO(ModelMapper mapper, ConversionContext conversionContext) {
		
		Converter<MateriaEntity, Materia> materiaConverter = new ContextualizedConverter<MateriaEntity, Materia>() {
			@Override
			public Materia convert(MateriaEntity source) {
				if (conversionContext.isIncludeTranslations()) {
					return toDTOWithTranslations(source, Materia.class, conversionContext.getRelationshipFields("materia"), conversionContext);
				}
				return toDTO(source, Materia.class, conversionContext.getRelationshipFields("materia"), conversionContext);
			}
		};
		
		
		Converter<ProfessorEntity, Professor> professorConverter = new ContextualizedConverter<ProfessorEntity, Professor>() {
			@Override
			public Professor convert(ProfessorEntity source) {
				if (conversionContext.isIncludeTranslations()) {
					return toDTOWithTranslations(source, Professor.class, conversionContext.getRelationshipFields("professor"), conversionContext);
				}
				return toDTO(source, Professor.class, conversionContext.getRelationshipFields("professor"), conversionContext);
			}
		};
		
		
		Converter <List<AlunoEntity>, List<Aluno>> alunosConverter = new ContextualizedConverter<List<AlunoEntity>, List<Aluno>>() {
			@Override
			public List<Aluno> convert(List<AlunoEntity> source) {
				if (conversionContext.isIncludeTranslations()) {
					return source.stream().map(e -> toDTOWithTranslations(e, Aluno.class, conversionContext.getRelationshipFields("alunos"), conversionContext)).collect(Collectors.toList());
				}
				return source.stream().map(e -> toDTO(e, Aluno.class, conversionContext.getRelationshipFields("alunos"), conversionContext)).collect(Collectors.toList());
			}
		};
		
		//eager relationships
		PropertyMap<TurmaEntity, Turma> turmaMap = new PropertyMap<TurmaEntity, Turma>() {
			@Override
			public void configure() {
				using(materiaConverter).map(source.getMateria(), destination.materia);
				using(professorConverter).map(source.getProfessor(), destination.professor);
				using(alunosConverter).map(source.getAlunos(), destination.alunos);
			}
		};
		//lazy relationships
		
		mapper.addMappings(turmaMap);
		
		if (mapper.getTypeMap(MateriaEntity.class, Materia.class) == null) {
		    this.materiaConverter.setupMapperToDTO(mapper, conversionContext);
		}
		if (mapper.getTypeMap(ProfessorEntity.class, Professor.class) == null) {
		    this.professorConverter.setupMapperToDTO(mapper, conversionContext);
		}
		if (mapper.getTypeMap(AlunoEntity.class, Aluno.class) == null) {
		    this.alunoConverter.setupMapperToDTO(mapper, conversionContext);
		}
		mapper.getTypeMap(TurmaEntity.class, Turma.class).setPropertyCondition(new ConvertedObjectCondition(conversionContext));
	}
}
