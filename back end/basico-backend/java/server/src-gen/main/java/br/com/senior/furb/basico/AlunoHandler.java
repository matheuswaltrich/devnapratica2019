/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import static br.com.senior.SecurityConstants.ENTITY_SECURITY_ACTION_CREATE;
import static br.com.senior.SecurityConstants.ENTITY_SECURITY_ACTION_DELETE;
import static br.com.senior.SecurityConstants.ENTITY_SECURITY_ACTION_UPDATE;
import static br.com.senior.SecurityConstants.ENTITY_SECURITY_ACTION_VIEW;
import static br.com.senior.furb.basico.AlunoEntity.SECURITY_RESOURCE;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.stream.Collectors;

import javax.inject.Inject;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.scheduling.annotation.Async;
import org.springframework.transaction.annotation.Transactional;

import br.com.senior.messaging.ErrorCategory;
import br.com.senior.messaging.model.HandlerImpl;
import br.com.senior.messaging.model.ServiceException;
import br.com.senior.messaging.security.SecureResource;
import br.com.senior.springbatchintegration.control.BatchIntegrationController;
import br.com.senior.springbatchintegration.importer.Importer;
import br.com.senior.springbatchintegration.importer.ImporterException;
import br.com.senior.springbatchintegration.model.Layout;
import br.com.senior.furb.basico.Aluno;
import br.com.senior.furb.basico.Aluno.Id;
import br.com.senior.furb.basico.Aluno.PageRequest;
import br.com.senior.furb.basico.Aluno.PagedResults;
import br.com.senior.furb.basico.BasicoConstants;
import br.com.senior.furb.basico.CreateAluno;
import br.com.senior.furb.basico.UpdateAluno;
import br.com.senior.furb.basico.DeleteAluno;
import br.com.senior.furb.basico.RetrieveAluno;
import br.com.senior.furb.basico.ListAluno;
import br.com.senior.furb.basico.ImportConfig;
import br.com.senior.furb.basico.LayoutDTOConverter;
import br.com.senior.furb.basico.ImportAlunoInput;
import br.com.senior.furb.basico.ImportAlunoOutput;
import br.com.senior.furb.basico.ExportAlunoInput;
import br.com.senior.furb.basico.ExportAlunoOutput;
import org.springframework.stereotype.Component;
import br.com.senior.furb.basico.AlunoDTOConverter;
import br.com.senior.platform.translationhub.api.TranslationHubApi;

@HandlerImpl(serviceClass = BasicoConstants.class)
@Component("furb.basico.AlunoHandler")
public class AlunoHandler implements CreateAluno, CreateMergeAluno, UpdateAluno, DeleteAluno, 
		 UpdateMergeAluno, CreateBulkAluno, RetrieveAluno, ListAluno, 
		 ImportAluno, ExportAluno {
	static final Logger logger = LoggerFactory.getLogger(AlunoHandler.class);

	@Inject
	AlunoCrudService service;
	
	@Inject
	AlunoDTOConverter dtoConverter;
	
	@Inject
	private TranslationHubApi translationHubApi;
	
	@SecureResource(name=SECURITY_RESOURCE, action=ENTITY_SECURITY_ACTION_CREATE)
	@Override
	public Aluno createAluno(Aluno toCreate) {
		try {
			AlunoEntity entity = service.createAluno(dtoConverter.toEntity(toCreate, AlunoEntity.class));
			return dtoConverter.toDTO(entity, Aluno.class);
			
		} catch (ServiceException | IllegalArgumentException e) {
			logger.error(e.getMessage(), e);
			throw e;
			
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw new ServiceException(ErrorCategory.INTERNAL_ERROR, "An internal error occurred: "
					+ e.getClass().getSimpleName() + ". Please check the request parameters and try again.", e);
		}
	}
	
	@SecureResource(name=SECURITY_RESOURCE, action=ENTITY_SECURITY_ACTION_CREATE)
	@Override
	public Aluno createMergeAluno(Aluno toCreate) {
		try {
			AlunoEntity entity = service.createAluno(dtoConverter.toEntity(toCreate, AlunoEntity.class));
			return dtoConverter.toDTO(entity, Aluno.class);
			
		} catch (ServiceException | IllegalArgumentException e) {
			logger.error(e.getMessage(), e);
			throw e;
			
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw new ServiceException(ErrorCategory.INTERNAL_ERROR, "An internal error occurred: "
					+ e.getClass().getSimpleName() + ". Please check the request parameters and try again.", e);
		}
	}
	
	@SecureResource(name=SECURITY_RESOURCE, action=ENTITY_SECURITY_ACTION_UPDATE)
	@Override
	public Aluno updateAluno(Aluno toUpdate) {
		try {
			AlunoEntity modified = doUpdate(toUpdate);
			return dtoConverter.toDTO(modified, Aluno.class);
			
		} catch (ServiceException | IllegalArgumentException e) {
			logger.error(e.getMessage(), e);
			throw e;
			
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw new ServiceException(ErrorCategory.INTERNAL_ERROR, "An internal error occurred: "
					+ e.getClass().getSimpleName() + ". Please check the request parameters and try again.", e);
		}
	}
	
	@SecureResource(name=SECURITY_RESOURCE, action=ENTITY_SECURITY_ACTION_UPDATE)
	@Override
	public Aluno updateMergeAluno(Aluno toUpdate) {
		try {
			AlunoEntity entity = service.retrieveAluno(new Aluno.Id(toUpdate.id));
			dtoConverter.mergeToEntity(toUpdate, entity);
			entity = service.updateAluno(entity);
			return dtoConverter.toDTO(entity, Aluno.class);
			
		} catch (ServiceException | IllegalArgumentException e) {
			logger.error(e.getMessage(), e);
			throw e;
			
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw new ServiceException(ErrorCategory.INTERNAL_ERROR, "An internal error occurred: "
					+ e.getClass().getSimpleName() + ". Please check the request parameters and try again.", e);
		}
	}
	
	private AlunoEntity doUpdate(Aluno toUpdate) {
		AlunoEntity entity = service.getRepository().findOne(java.util.UUID.fromString(toUpdate.id));
		
		if(entity == null)
			throw new ServiceException(ErrorCategory.OBJECT_NOT_FOUND, translationHubApi.getString("br.com.senior.furb.basico.Aluno_notFound", "Aluno not found with id " + toUpdate.id));
		
		dtoConverter.toEntity(toUpdate, entity);
		return doUpdate(entity);
	}
	
	private AlunoEntity doUpdate(AlunoEntity entity) {
		return service.updateAluno(entity);
	}
	
	@SecureResource(name=SECURITY_RESOURCE, action=ENTITY_SECURITY_ACTION_DELETE)
	@Override
	public void deleteAluno(Id id) {
		this.service.deleteAluno(id);
	}
	
	@SecureResource(name=SECURITY_RESOURCE, action=ENTITY_SECURITY_ACTION_VIEW)
	@Transactional(readOnly = true)
	@Override
	public Aluno retrieveAluno(Id id) {
		AlunoEntity entity = service.retrieveAluno(id);
		return dtoConverter.toDTO(entity, Aluno.class);
	}
	
	@SecureResource(name=SECURITY_RESOURCE, action=ENTITY_SECURITY_ACTION_VIEW)
	@Transactional(readOnly = true)
	@Override
	public PagedResults listAluno(PageRequest pageRequest) {
		int skip = pageRequest.offset != null ? pageRequest.offset.intValue() : 0;
		int top = pageRequest.size != null ? pageRequest.size.intValue() : 0;
		String orderBy = pageRequest.orderBy;
		String filter = pageRequest.filter;
		Page<AlunoEntity> pages = this.service.listAlunoPageable(skip, top, orderBy, filter);
		List<AlunoEntity> entities = pages.getContent();
		List<Aluno> dtos = null;
		
		dtos = entities != null ? entities.stream().map(e -> dtoConverter.toDTO(e, Aluno.class, pageRequest.displayFields)).collect(Collectors.toList()) : null;
		return new PagedResults(dtos, Long.valueOf(pages.getTotalPages()), Long.valueOf(pages.getTotalElements()));
	}
	
	@SecureResource(name=SECURITY_RESOURCE, action=ENTITY_SECURITY_ACTION_CREATE)
	@Transactional
	@Override
	public CreateBulkAlunoOutput createBulkAluno(CreateBulkAlunoInput toCreate) {
		if (toCreate != null) {
			List<Aluno> entitiesToCreate = toCreate.entities;
			if (entitiesToCreate != null && !entitiesToCreate.isEmpty()) {
				entitiesToCreate.forEach(bean -> {
					bean.validate();
				});
				
				List<AlunoEntity> entities = entitiesToCreate.stream().map(bean -> dtoConverter.toEntity(bean, AlunoEntity.class))
						.collect(Collectors.toList());
				this.service.createBulk(entities);
			}
		}
		return new CreateBulkAlunoOutput();
	}
	
	@SecureResource(name=SECURITY_RESOURCE, action=ENTITY_SECURITY_ACTION_CREATE)
	@Transactional
	@Override
	public ImportAlunoOutput importAluno(ImportAlunoInput request) {
		Importer importer = BatchIntegrationController.getInstance().newImporter();
		StartImportProcess startImportProcess = new StartImportProcess(importer, request.config);
		startImportProcess.start();
		ImportAlunoOutput output = new ImportAlunoOutput(importer.getId());
		return output;
	}
	
	@SecureResource(name=SECURITY_RESOURCE, action=ENTITY_SECURITY_ACTION_VIEW)
	@Transactional(readOnly = true)
	@Override
	public ExportAlunoOutput exportAluno(ExportAlunoInput request) {
		/*
		 * **** Not implemented yet **** ExporterControl control =
		 * ExporterControl.getInstance(); Exporter exporter =
		 * control.newExporter(); StartExportProcess startExportProcess = new
		 * StartExportProcess(exporter, request.config);
		 * startExportProcess.start();
		 */
		ExportAlunoOutput output = new ExportAlunoOutput(
				null /* exporter.getId() */);
		return output;
	}
	
	class StartImportProcess extends Thread {
	
		private Importer importer;
		private ImportConfig config;
		
		StartImportProcess(Importer importer, ImportConfig config) {
			this.importer = importer;
			this.importer.addListener(new AlunoImporterListener());
			this.config = config;
			this.importer.logUri(this.config.uri);
		}
		
		@Async
		@Override
		public void run() {
			File blob = getBlobFile();
			try {
				Layout layout = LayoutDTOConverter.dtoToLayout(config.layout);
				try (FileReader reader = new FileReader(blob)) {
					importer.setReader(reader);
					importer.setLayout(layout);
					importer.setBeanClass(Aluno.class.getName());
					importer.setCrudService(AlunoHandler.this.service, (config.batchSize > 0));
					importer.setBatchSize(config.batchSize);
					if (config.async) {
						importer.startAsync();
					} else {
						try {
							importer.start();
						} catch (ImporterException e) {
							logger.error(e.getMessage(), e);
						}
					}
				}
			} catch (IOException e) {
				// isto nao deveria ocorrer
				logger.error(e.getMessage(), e);
			}
		}
		
		private File getBlobFile() {
			URI uri = null;
			try {
				uri = new URI(config.uri);
			} catch (URISyntaxException e1) {
				logger.error(e1.getMessage(), e1);
			}
			String scheme = uri.getScheme();
			if (scheme.equals("file")) {
				return new File(uri);
			} else if (scheme.startsWith("http")) {
				return getHttpBlobFile(uri);
			}
			return null;
		}
		
		private File getHttpBlobFile(URI uri) {
			importer.notifyDownload();
			HttpGet get = new HttpGet(uri);
			try (CloseableHttpClient httpClient = HttpClients.createDefault();
					CloseableHttpResponse httpResponse = httpClient.execute(get);
					InputStream is = httpResponse.getEntity().getContent()) {
				File blob = File.createTempFile("aluno", "blob");
				try (FileOutputStream fos = new FileOutputStream(blob);
						BufferedOutputStream bos = new BufferedOutputStream(fos);
						BufferedInputStream bis = new BufferedInputStream(is)) {
					byte[] bytes = new byte[8192];
					int tam = 0;
					while ((tam = bis.read(bytes)) > 0) {
						bos.write(bytes, 0, tam);
					}
					bos.flush();
					fos.flush();
				}
				return blob;
			} catch (IOException e) {
				logger.error(e.getMessage(), e);
			}
			return null;
		}
	}
}
