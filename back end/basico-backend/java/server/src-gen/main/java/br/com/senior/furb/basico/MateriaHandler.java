/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import static br.com.senior.SecurityConstants.ENTITY_SECURITY_ACTION_CREATE;
import static br.com.senior.SecurityConstants.ENTITY_SECURITY_ACTION_DELETE;
import static br.com.senior.SecurityConstants.ENTITY_SECURITY_ACTION_UPDATE;
import static br.com.senior.SecurityConstants.ENTITY_SECURITY_ACTION_VIEW;
import static br.com.senior.furb.basico.MateriaEntity.SECURITY_RESOURCE;

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
import br.com.senior.furb.basico.Materia;
import br.com.senior.furb.basico.Materia.Id;
import br.com.senior.furb.basico.Materia.PageRequest;
import br.com.senior.furb.basico.Materia.PagedResults;
import br.com.senior.furb.basico.BasicoConstants;
import br.com.senior.furb.basico.CreateMateria;
import br.com.senior.furb.basico.UpdateMateria;
import br.com.senior.furb.basico.DeleteMateria;
import br.com.senior.furb.basico.RetrieveMateria;
import br.com.senior.furb.basico.ListMateria;
import br.com.senior.furb.basico.ImportConfig;
import br.com.senior.furb.basico.LayoutDTOConverter;
import br.com.senior.furb.basico.ImportMateriaInput;
import br.com.senior.furb.basico.ImportMateriaOutput;
import br.com.senior.furb.basico.ExportMateriaInput;
import br.com.senior.furb.basico.ExportMateriaOutput;
import org.springframework.stereotype.Component;
import br.com.senior.furb.basico.MateriaDTOConverter;
import br.com.senior.platform.translationhub.api.TranslationHubApi;

@HandlerImpl(serviceClass = BasicoConstants.class)
@Component("furb.basico.MateriaHandler")
public class MateriaHandler implements CreateMateria, CreateMergeMateria, UpdateMateria, DeleteMateria, 
		 UpdateMergeMateria, CreateBulkMateria, RetrieveMateria, ListMateria, 
		 ImportMateria, ExportMateria {
	static final Logger logger = LoggerFactory.getLogger(MateriaHandler.class);

	@Inject
	MateriaCrudService service;
	
	@Inject
	MateriaDTOConverter dtoConverter;
	
	@Inject
	private TranslationHubApi translationHubApi;
	
	@SecureResource(name=SECURITY_RESOURCE, action=ENTITY_SECURITY_ACTION_CREATE)
	@Override
	public Materia createMateria(Materia toCreate) {
		try {
			MateriaEntity entity = service.createMateria(dtoConverter.toEntity(toCreate, MateriaEntity.class));
			return dtoConverter.toDTO(entity, Materia.class);
			
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
	public Materia createMergeMateria(Materia toCreate) {
		try {
			MateriaEntity entity = service.createMateria(dtoConverter.toEntity(toCreate, MateriaEntity.class));
			return dtoConverter.toDTO(entity, Materia.class);
			
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
	public Materia updateMateria(Materia toUpdate) {
		try {
			MateriaEntity modified = doUpdate(toUpdate);
			return dtoConverter.toDTO(modified, Materia.class);
			
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
	public Materia updateMergeMateria(Materia toUpdate) {
		try {
			MateriaEntity entity = service.retrieveMateria(new Materia.Id(toUpdate.id));
			dtoConverter.mergeToEntity(toUpdate, entity);
			entity = service.updateMateria(entity);
			return dtoConverter.toDTO(entity, Materia.class);
			
		} catch (ServiceException | IllegalArgumentException e) {
			logger.error(e.getMessage(), e);
			throw e;
			
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw new ServiceException(ErrorCategory.INTERNAL_ERROR, "An internal error occurred: "
					+ e.getClass().getSimpleName() + ". Please check the request parameters and try again.", e);
		}
	}
	
	private MateriaEntity doUpdate(Materia toUpdate) {
		MateriaEntity entity = service.getRepository().findOne(java.util.UUID.fromString(toUpdate.id));
		
		if(entity == null)
			throw new ServiceException(ErrorCategory.OBJECT_NOT_FOUND, translationHubApi.getString("br.com.senior.furb.basico.Materia_notFound", "Materia not found with id " + toUpdate.id));
		
		dtoConverter.toEntity(toUpdate, entity);
		return doUpdate(entity);
	}
	
	private MateriaEntity doUpdate(MateriaEntity entity) {
		return service.updateMateria(entity);
	}
	
	@SecureResource(name=SECURITY_RESOURCE, action=ENTITY_SECURITY_ACTION_DELETE)
	@Override
	public void deleteMateria(Id id) {
		this.service.deleteMateria(id);
	}
	
	@SecureResource(name=SECURITY_RESOURCE, action=ENTITY_SECURITY_ACTION_VIEW)
	@Transactional(readOnly = true)
	@Override
	public Materia retrieveMateria(Id id) {
		MateriaEntity entity = service.retrieveMateria(id);
		return dtoConverter.toDTO(entity, Materia.class);
	}
	
	@SecureResource(name=SECURITY_RESOURCE, action=ENTITY_SECURITY_ACTION_VIEW)
	@Transactional(readOnly = true)
	@Override
	public PagedResults listMateria(PageRequest pageRequest) {
		int skip = pageRequest.offset != null ? pageRequest.offset.intValue() : 0;
		int top = pageRequest.size != null ? pageRequest.size.intValue() : 0;
		String orderBy = pageRequest.orderBy;
		String filter = pageRequest.filter;
		Page<MateriaEntity> pages = this.service.listMateriaPageable(skip, top, orderBy, filter);
		List<MateriaEntity> entities = pages.getContent();
		List<Materia> dtos = null;
		
		dtos = entities != null ? entities.stream().map(e -> dtoConverter.toDTO(e, Materia.class, pageRequest.displayFields)).collect(Collectors.toList()) : null;
		return new PagedResults(dtos, Long.valueOf(pages.getTotalPages()), Long.valueOf(pages.getTotalElements()));
	}
	
	@SecureResource(name=SECURITY_RESOURCE, action=ENTITY_SECURITY_ACTION_CREATE)
	@Transactional
	@Override
	public CreateBulkMateriaOutput createBulkMateria(CreateBulkMateriaInput toCreate) {
		if (toCreate != null) {
			List<Materia> entitiesToCreate = toCreate.entities;
			if (entitiesToCreate != null && !entitiesToCreate.isEmpty()) {
				entitiesToCreate.forEach(bean -> {
					bean.validate();
				});
				
				List<MateriaEntity> entities = entitiesToCreate.stream().map(bean -> dtoConverter.toEntity(bean, MateriaEntity.class))
						.collect(Collectors.toList());
				this.service.createBulk(entities);
			}
		}
		return new CreateBulkMateriaOutput();
	}
	
	@SecureResource(name=SECURITY_RESOURCE, action=ENTITY_SECURITY_ACTION_CREATE)
	@Transactional
	@Override
	public ImportMateriaOutput importMateria(ImportMateriaInput request) {
		Importer importer = BatchIntegrationController.getInstance().newImporter();
		StartImportProcess startImportProcess = new StartImportProcess(importer, request.config);
		startImportProcess.start();
		ImportMateriaOutput output = new ImportMateriaOutput(importer.getId());
		return output;
	}
	
	@SecureResource(name=SECURITY_RESOURCE, action=ENTITY_SECURITY_ACTION_VIEW)
	@Transactional(readOnly = true)
	@Override
	public ExportMateriaOutput exportMateria(ExportMateriaInput request) {
		/*
		 * **** Not implemented yet **** ExporterControl control =
		 * ExporterControl.getInstance(); Exporter exporter =
		 * control.newExporter(); StartExportProcess startExportProcess = new
		 * StartExportProcess(exporter, request.config);
		 * startExportProcess.start();
		 */
		ExportMateriaOutput output = new ExportMateriaOutput(
				null /* exporter.getId() */);
		return output;
	}
	
	class StartImportProcess extends Thread {
	
		private Importer importer;
		private ImportConfig config;
		
		StartImportProcess(Importer importer, ImportConfig config) {
			this.importer = importer;
			this.importer.addListener(new MateriaImporterListener());
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
					importer.setBeanClass(Materia.class.getName());
					importer.setCrudService(MateriaHandler.this.service, (config.batchSize > 0));
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
				File blob = File.createTempFile("materia", "blob");
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
