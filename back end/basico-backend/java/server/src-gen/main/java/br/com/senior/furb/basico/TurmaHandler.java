/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import static br.com.senior.SecurityConstants.ENTITY_SECURITY_ACTION_CREATE;
import static br.com.senior.SecurityConstants.ENTITY_SECURITY_ACTION_DELETE;
import static br.com.senior.SecurityConstants.ENTITY_SECURITY_ACTION_UPDATE;
import static br.com.senior.SecurityConstants.ENTITY_SECURITY_ACTION_VIEW;
import static br.com.senior.furb.basico.TurmaEntity.SECURITY_RESOURCE;

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
import br.com.senior.furb.basico.Turma;
import br.com.senior.furb.basico.Turma.Id;
import br.com.senior.furb.basico.Turma.PageRequest;
import br.com.senior.furb.basico.Turma.PagedResults;
import br.com.senior.furb.basico.BasicoConstants;
import br.com.senior.furb.basico.CreateTurma;
import br.com.senior.furb.basico.UpdateTurma;
import br.com.senior.furb.basico.DeleteTurma;
import br.com.senior.furb.basico.RetrieveTurma;
import br.com.senior.furb.basico.ListTurma;
import br.com.senior.furb.basico.ImportConfig;
import br.com.senior.furb.basico.LayoutDTOConverter;
import br.com.senior.furb.basico.ImportTurmaInput;
import br.com.senior.furb.basico.ImportTurmaOutput;
import br.com.senior.furb.basico.ExportTurmaInput;
import br.com.senior.furb.basico.ExportTurmaOutput;
import org.springframework.stereotype.Component;
import br.com.senior.furb.basico.TurmaDTOConverter;
import br.com.senior.platform.translationhub.api.TranslationHubApi;

@HandlerImpl(serviceClass = BasicoConstants.class)
@Component("furb.basico.TurmaHandler")
public class TurmaHandler implements CreateTurma, CreateMergeTurma, UpdateTurma, DeleteTurma, 
		 UpdateMergeTurma, CreateBulkTurma, RetrieveTurma, ListTurma, 
		 ImportTurma, ExportTurma {
	static final Logger logger = LoggerFactory.getLogger(TurmaHandler.class);

	@Inject
	TurmaCrudService service;
	
	@Inject
	TurmaDTOConverter dtoConverter;
	
	@Inject
	private TranslationHubApi translationHubApi;
	
	@SecureResource(name=SECURITY_RESOURCE, action=ENTITY_SECURITY_ACTION_CREATE)
	@Transactional
	@Override
	public Turma createTurma(Turma toCreate) {
		try {
			TurmaEntity entity = service.createTurma(dtoConverter.toEntity(toCreate, TurmaEntity.class));
			return dtoConverter.toDTO(entity, Turma.class);
			
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
	@Transactional
	@Override
	public Turma createMergeTurma(Turma toCreate) {
		try {
			TurmaEntity entity = service.createTurma(dtoConverter.toEntity(toCreate, TurmaEntity.class));
			return dtoConverter.toDTO(entity, Turma.class);
			
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
	@Transactional
	@Override
	public Turma updateTurma(Turma toUpdate) {
		try {
			TurmaEntity modified = doUpdate(toUpdate);
			return dtoConverter.toDTO(modified, Turma.class);
			
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
	@Transactional
	@Override
	public Turma updateMergeTurma(Turma toUpdate) {
		try {
			TurmaEntity entity = service.retrieveTurma(new Turma.Id(toUpdate.id));
			dtoConverter.mergeToEntity(toUpdate, entity);
			entity = service.updateTurma(entity);
			return dtoConverter.toDTO(entity, Turma.class);
			
		} catch (ServiceException | IllegalArgumentException e) {
			logger.error(e.getMessage(), e);
			throw e;
			
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw new ServiceException(ErrorCategory.INTERNAL_ERROR, "An internal error occurred: "
					+ e.getClass().getSimpleName() + ". Please check the request parameters and try again.", e);
		}
	}
	
	private TurmaEntity doUpdate(Turma toUpdate) {
		TurmaEntity entity = service.getRepository().findOne(java.util.UUID.fromString(toUpdate.id));
		
		if(entity == null)
			throw new ServiceException(ErrorCategory.OBJECT_NOT_FOUND, translationHubApi.getString("br.com.senior.furb.basico.Turma_notFound", "Turma not found with id " + toUpdate.id));
		
		dtoConverter.toEntity(toUpdate, entity);
		return doUpdate(entity);
	}
	
	private TurmaEntity doUpdate(TurmaEntity entity) {
		return service.updateTurma(entity);
	}
	
	@SecureResource(name=SECURITY_RESOURCE, action=ENTITY_SECURITY_ACTION_DELETE)
	@Override
	public void deleteTurma(Id id) {
		this.service.deleteTurma(id);
	}
	
	@SecureResource(name=SECURITY_RESOURCE, action=ENTITY_SECURITY_ACTION_VIEW)
	@Transactional(readOnly = true)
	@Override
	public Turma retrieveTurma(Id id) {
		TurmaEntity entity = service.retrieveTurma(id);
		return dtoConverter.toDTO(entity, Turma.class);
	}
	
	@SecureResource(name=SECURITY_RESOURCE, action=ENTITY_SECURITY_ACTION_VIEW)
	@Transactional(readOnly = true)
	@Override
	public PagedResults listTurma(PageRequest pageRequest) {
		int skip = pageRequest.offset != null ? pageRequest.offset.intValue() : 0;
		int top = pageRequest.size != null ? pageRequest.size.intValue() : 0;
		String orderBy = pageRequest.orderBy;
		String filter = pageRequest.filter;
		Page<TurmaEntity> pages = this.service.listTurmaPageable(skip, top, orderBy, filter);
		List<TurmaEntity> entities = pages.getContent();
		List<Turma> dtos = null;
		
		dtos = entities != null ? entities.stream().map(e -> dtoConverter.toDTO(e, Turma.class, pageRequest.displayFields)).collect(Collectors.toList()) : null;
		return new PagedResults(dtos, Long.valueOf(pages.getTotalPages()), Long.valueOf(pages.getTotalElements()));
	}
	
	@SecureResource(name=SECURITY_RESOURCE, action=ENTITY_SECURITY_ACTION_CREATE)
	@Transactional
	@Override
	public CreateBulkTurmaOutput createBulkTurma(CreateBulkTurmaInput toCreate) {
		if (toCreate != null) {
			List<Turma> entitiesToCreate = toCreate.entities;
			if (entitiesToCreate != null && !entitiesToCreate.isEmpty()) {
				entitiesToCreate.forEach(bean -> {
					bean.validate();
				});
				
				List<TurmaEntity> entities = entitiesToCreate.stream().map(bean -> dtoConverter.toEntity(bean, TurmaEntity.class))
						.collect(Collectors.toList());
				this.service.createBulk(entities);
			}
		}
		return new CreateBulkTurmaOutput();
	}
	
	@SecureResource(name=SECURITY_RESOURCE, action=ENTITY_SECURITY_ACTION_CREATE)
	@Transactional
	@Override
	public ImportTurmaOutput importTurma(ImportTurmaInput request) {
		Importer importer = BatchIntegrationController.getInstance().newImporter();
		StartImportProcess startImportProcess = new StartImportProcess(importer, request.config);
		startImportProcess.start();
		ImportTurmaOutput output = new ImportTurmaOutput(importer.getId());
		return output;
	}
	
	@SecureResource(name=SECURITY_RESOURCE, action=ENTITY_SECURITY_ACTION_VIEW)
	@Transactional(readOnly = true)
	@Override
	public ExportTurmaOutput exportTurma(ExportTurmaInput request) {
		/*
		 * **** Not implemented yet **** ExporterControl control =
		 * ExporterControl.getInstance(); Exporter exporter =
		 * control.newExporter(); StartExportProcess startExportProcess = new
		 * StartExportProcess(exporter, request.config);
		 * startExportProcess.start();
		 */
		ExportTurmaOutput output = new ExportTurmaOutput(
				null /* exporter.getId() */);
		return output;
	}
	
	class StartImportProcess extends Thread {
	
		private Importer importer;
		private ImportConfig config;
		
		StartImportProcess(Importer importer, ImportConfig config) {
			this.importer = importer;
			this.importer.addListener(new TurmaImporterListener());
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
					importer.setBeanClass(Turma.class.getName());
					importer.setCrudService(TurmaHandler.this.service, (config.batchSize > 0));
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
				File blob = File.createTempFile("turma", "blob");
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
