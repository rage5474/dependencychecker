package de.raphaelgeissler.dependencychecker.core.impl.validation;

import de.raphaelgeissler.dependencychecker.ComponentDescription;
import de.raphaelgeissler.dependencychecker.ComponentItemDescription;
import de.raphaelgeissler.dependencychecker.DependencycheckerFactory;

public class DValCompBuilder {

	private ComponentDescription compDesc;

	public DValCompBuilder(String name) {
		compDesc = DependencycheckerFactory.eINSTANCE.createComponentDescription();
		compDesc.setName(name);
	}

	public DValCompBuilder id(String id) {
		ComponentItemDescription itemDescr = DependencycheckerFactory.eINSTANCE.createComponentItemDescription();
		itemDescr.setId(id);
		compDesc.getComponentItems().add(itemDescr);
		return this;
	}
	
	public DValCompBuilder forbidden(String forbiddenCompId) {
		compDesc.getForbiddenComponents().add(forbiddenCompId);
		return this;
	}
	
	public ComponentDescription build() {
		return compDesc;
	}

	public DValCompBuilder port(String portId) {
		ComponentItemDescription itemDescr = DependencycheckerFactory.eINSTANCE.createComponentItemDescription();
		itemDescr.setId(portId);
		compDesc.getPorts().add(itemDescr);
		return this;
	}

}
