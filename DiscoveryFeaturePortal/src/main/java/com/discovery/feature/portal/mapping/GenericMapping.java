package com.discovery.feature.portal.mapping;

import java.util.List;

import com.discovery.feature.portal.mvc.entity.CommentsTab;

public final class GenericMapping {
	
	private GenericMapping() {}
	
	public static String buscarIdiomaEnComments(List<CommentsTab> comments) {
		String idioma = "";
		for (CommentsTab commentsTab : comments) {
			if (commentsTab.getValue().contains("language")) {
				idioma = commentsTab.getValue();
			}
		}
		return idioma;
	}
	
//	public static String CommentsToString(List<CommentsTab> comments) {
//		String idioma = "";
//		for (CommentsTab commentsTab : comments) {
//			if (commentsTab.getValue().contains("language")) {
//				idioma = commentsTab.getValue();
//			}
//		}
//		return idioma;
//	}


}
