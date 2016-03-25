/*
 * generated by Xtext 2.9.1
 */
package de.ragedev.cdsl.serializer;

import com.google.inject.Inject;
import de.ragedev.cdsl.cDSL.CDSLPackage;
import de.ragedev.cdsl.cDSL.ComponentDescription;
import de.ragedev.cdsl.cDSL.ComponentID;
import de.ragedev.cdsl.cDSL.DValidator;
import de.ragedev.cdsl.cDSL.Domainmodel;
import de.ragedev.cdsl.cDSL.NotAllowedRef;
import de.ragedev.cdsl.cDSL.Ports;
import de.ragedev.cdsl.cDSL.UnitElements;
import de.ragedev.cdsl.services.CDSLGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;

@SuppressWarnings("all")
public class CDSLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private CDSLGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == CDSLPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case CDSLPackage.COMPONENT_DESCRIPTION:
				sequence_ComponentDescription(context, (ComponentDescription) semanticObject); 
				return; 
			case CDSLPackage.COMPONENT_ID:
				sequence_ComponentID(context, (ComponentID) semanticObject); 
				return; 
			case CDSLPackage.DVALIDATOR:
				sequence_DValidator(context, (DValidator) semanticObject); 
				return; 
			case CDSLPackage.DOMAINMODEL:
				sequence_Domainmodel(context, (Domainmodel) semanticObject); 
				return; 
			case CDSLPackage.NOT_ALLOWED_REF:
				sequence_NotAllowedRef(context, (NotAllowedRef) semanticObject); 
				return; 
			case CDSLPackage.PORTS:
				sequence_Ports(context, (Ports) semanticObject); 
				return; 
			case CDSLPackage.UNIT_ELEMENTS:
				sequence_UnitElements(context, (UnitElements) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     AbstractEntry returns ComponentDescription
	 *     ComponentDescription returns ComponentDescription
	 *
	 * Constraint:
	 *     (name=ID ports=Ports? units=UnitElements? notAllowedRef=NotAllowedRef?)
	 */
	protected void sequence_ComponentDescription(ISerializationContext context, ComponentDescription semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ComponentID returns ComponentID
	 *
	 * Constraint:
	 *     qualifiedNames+=QualifiedName+
	 */
	protected void sequence_ComponentID(ISerializationContext context, ComponentID semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractEntry returns DValidator
	 *     DValidator returns DValidator
	 *
	 * Constraint:
	 *     (valName=ID refComponents+=[ComponentDescription|ID]+)
	 */
	protected void sequence_DValidator(ISerializationContext context, DValidator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Domainmodel returns Domainmodel
	 *
	 * Constraint:
	 *     entries+=AbstractEntry+
	 */
	protected void sequence_Domainmodel(ISerializationContext context, Domainmodel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     NotAllowedRef returns NotAllowedRef
	 *
	 * Constraint:
	 *     units+=[ComponentDescription|ID]+
	 */
	protected void sequence_NotAllowedRef(ISerializationContext context, NotAllowedRef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Ports returns Ports
	 *
	 * Constraint:
	 *     port+=QualifiedName+
	 */
	protected void sequence_Ports(ISerializationContext context, Ports semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     UnitElements returns UnitElements
	 *
	 * Constraint:
	 *     unit+=ComponentID+
	 */
	protected void sequence_UnitElements(ISerializationContext context, UnitElements semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}