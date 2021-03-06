package org.springframework.roo.addon.web.mvc.thymeleaf.addon;

import org.springframework.roo.addon.web.mvc.views.MVCViewGenerationService;
import org.springframework.roo.addon.web.mvc.views.ViewContext;

/**
 * Extends {@link MVCViewGenerationService} to provider specific operations for Thymleaf
 * view
 *
 * @author Jose Manuel Vivó
 * @since 2.0
 */
public interface ThymeleafViewGeneratorService extends MVCViewGenerationService<ThymeleafMetadata> {

  void addModalConfirmDelete(String moduleName, ViewContext<ThymeleafMetadata> ctx);

}
