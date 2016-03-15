package de.raphaelgeissler.dependencychecker.core.impl.validation;

import de.raphaelgeissler.dependencychecker.Checker;
import de.raphaelgeissler.dependencychecker.ComponentDescription;
import de.raphaelgeissler.dependencychecker.DependencycheckerFactory;

public class DValBuilder {

	private Checker checker;

	public DValBuilder(String name) {
		checker = DependencycheckerFactory.eINSTANCE.createChecker();
		checker.setName(name);
		
	}

	public DValBuilder comp(DValCompBuilder compBuilder) {
		comp(compBuilder.build());
		return this;
	}
	
	public DValBuilder comp(ComponentDescription compDescr) {
		checker.getComponentDefinitions().add(compDescr);
		return this;
	}

	public Checker build() {
		return checker;
	}

}
