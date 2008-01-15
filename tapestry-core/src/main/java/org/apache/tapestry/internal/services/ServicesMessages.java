// Copyright 2006, 2007, 2008 The Apache Software Foundation
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package org.apache.tapestry.internal.services;

import javassist.CtClass;
import org.apache.tapestry.ioc.Location;
import org.apache.tapestry.ioc.Messages;
import org.apache.tapestry.ioc.Resource;
import org.apache.tapestry.ioc.internal.util.CollectionFactory;
import org.apache.tapestry.ioc.internal.util.InternalUtils;
import org.apache.tapestry.ioc.internal.util.MessagesImpl;
import org.apache.tapestry.ioc.services.ClassFabUtils;
import org.apache.tapestry.runtime.Component;
import org.apache.tapestry.runtime.RenderCommand;
import org.apache.tapestry.services.TransformMethodSignature;

import java.net.URL;
import java.util.Collection;
import java.util.List;
import java.util.Locale;

class ServicesMessages
{
    private static final Messages MESSAGES = MessagesImpl.forClass(ServicesMessages.class);

    static String duplicateContribution(Object conflict, Class contributionType, Object existing)
    {
        return MESSAGES.format("duplicate-contribution", conflict, contributionType.getName(), existing);
    }

    static String markupWriterNoCurrentElement()
    {
        return MESSAGES.get("markup-writer-no-current-element");
    }

    static String noConstructorFound(Class instanceClass)
    {
        return MESSAGES.format("no-constructor-found", instanceClass.getName());
    }

    static String missingDeclaredField(CtClass ctClass, String fieldName)
    {
        return MESSAGES.format("missing-declared-field", ctClass.getName(), fieldName);
    }

    static String errorAddingMethod(CtClass ctClass, String methodName, Throwable cause)
    {
        return MESSAGES.format("error-adding-method", ctClass.getName(), methodName, cause);
    }

    static String fieldAlreadyClaimed(String fieldName, CtClass ctClass, Object existingTag, Object newTag)
    {
        return MESSAGES.format("field-already-claimed", fieldName, ctClass.getName(), existingTag, newTag);
    }

    static String noDeclaredMethod(CtClass ctClass, TransformMethodSignature methodSignature)
    {
        return MESSAGES.format("no-declared-method", ctClass.getName(), methodSignature);
    }

    static String classNotTransformed(String className)
    {
        return MESSAGES.format("class-not-transformed", className);
    }

    static String newParserError(Resource resource, Throwable cause)
    {
        return MESSAGES.format("new-parser-error", resource, cause);
    }

    static String missingTemplateResource(Resource resource)
    {
        return MESSAGES.format("missing-template-resource", resource);
    }

    static String templateParseError(Resource resource, Throwable cause)
    {
        return MESSAGES.format("template-parse-error", resource, cause);
    }

    static String contentInsideBodyNotAllowed(Location location)
    {
        return MESSAGES.format("content-inside-body-not-allowed", location);
    }

    static String mayNotNestElementsInsideBody(String elementName)
    {
        return MESSAGES.format("may-not-nest-elements-inside-body", elementName);
    }

    static String methodCompileError(TransformMethodSignature signature, String methodBody, Throwable cause)
    {
        return MESSAGES.format("method-compile-error", signature, methodBody, cause);
    }

    static String renderQueueError(RenderCommand command, Throwable cause)
    {
        return MESSAGES.format("render-queue-error", command, cause);
    }

    static String readOnlyField(String className, String fieldName)
    {
        return MESSAGES.format("read-only-field", className, fieldName);
    }

    static String nonPrivateFields(String className, List<String> names)
    {
        return MESSAGES.format("non-private-fields", className, InternalUtils.joinSorted(names));
    }

    static String compTypeConflict(String embeddedId, String templateType, String modelType)
    {
        return MESSAGES.format("comp-type-conflict", embeddedId, templateType, modelType);
    }

    static String noTypeForEmbeddedComponent(String embeddedId, String componentClassName)
    {
        return MESSAGES.format("no-type-for-embedded-component", embeddedId, componentClassName);
    }

    static String embeddedComponentsNotInTemplate(Collection<String> ids, String componentClassName)
    {
        return MESSAGES.format("embedded-components-not-in-template", InternalUtils.joinSorted(ids),
                               componentClassName);
    }

    static String bindingSourceFailure(String expression, Throwable cause)
    {
        return MESSAGES.format("binding-source-failure", expression, cause);
    }

    static String contextIndexOutOfRange(String methodDescription)
    {
        return MESSAGES.format("context-index-out-of-range", methodDescription);
    }

    static String pageNameUnresolved(String pageClassName)
    {
        return MESSAGES.format("page-name-unresolved", pageClassName);
    }

    static String exceptionInMethodParameter(String methodDescription, int index, Throwable cause)
    {
        return MESSAGES
                .format("exception-in-method-parameter", methodDescription, index + 1, cause);
    }

    static String componentEventIsAborted(String methodDescription)
    {
        return MESSAGES.format("component-event-is-aborted", methodDescription);
    }

    static String unknownPersistentFieldStrategy(String stategyName, Collection<String> strategyNames)
    {
        return MESSAGES.format("unknown-persistent-field-strategy", stategyName, InternalUtils
                .joinSorted(strategyNames));
    }

    static String couldNotResolvePageName(String pageName, Collection<String> pageNames)
    {
        return MESSAGES.format("could-not-resolve-page-name", pageName, InternalUtils
                .joinSorted(pageNames));
    }

    static String couldNotCanonicalizePageName(String pageName, Collection<String> pageNames)
    {
        return MESSAGES.format("could-not-canonicalize-page-name", pageName, InternalUtils
                .joinSorted(pageNames));
    }

    static String couldNotResolveComponentType(String componentType, Collection<String> componentTypes)
    {
        return MESSAGES.format("could-not-resolve-component-type", componentType, InternalUtils
                .joinSorted(componentTypes));
    }

    static String couldNotResolveMixinType(String mixinType, Collection<String> mixinTypes)
    {
        return MESSAGES.format("could-not-resolve-mixin-type", mixinType, InternalUtils
                .joinSorted(mixinTypes));
    }

    static String parameterNameMustBeUnique(String parameterName, String parameterValue)
    {
        return MESSAGES.format("parameter-name-must-be-unique", parameterName, parameterValue);
    }

    static String pageIsDirty(Object page)
    {
        return MESSAGES.format("page-is-dirty", page);
    }

    static String componentInstanceIsNotAPage(String methodDescription, Component component, Component result)
    {
        return MESSAGES.format("component-instance-is-not-a-page", methodDescription, component
                .getComponentResources().getCompleteId(), result.getComponentResources()
                .getCompleteId());
    }

    static String failureReadingMessages(URL url, Throwable cause)
    {
        return MESSAGES.format("failure-reading-messages", url, cause);
    }

    static String unknownAssetPrefix(String path)
    {
        return MESSAGES.format("unknown-asset-prefix", path);
    }

    static String assetDoesNotExist(Resource resource)
    {
        return MESSAGES.format("asset-does-not-exist", resource);
    }

    static String wrongAssetDigest(Resource resource)
    {
        return MESSAGES.format("wrong-asset-digest", resource.getPath());
    }

    static String componentNotAssignableToField(Component component, String fieldName, String fieldType)
    {
        return MESSAGES.format("component-not-assignable-to-field", component
                .getComponentResources().getCompleteId(), fieldName, fieldType);
    }

    static String unknownValidatorType(String validatorType, List<String> knownValidatorTypes)
    {
        return MESSAGES.format("unknown-validator-type", validatorType, InternalUtils
                .join(knownValidatorTypes));
    }

    static String unknownTranslatorType(String translatorType, List<String> knownTranslatorTypes)
    {
        return MESSAGES.format("unknown-translator-type", translatorType, InternalUtils
                .join(knownTranslatorTypes));
    }

    static String validatorSpecificationParseError(int cursor, String specification)
    {
        return MESSAGES.format("validator-specification-parse-error", specification.charAt(cursor), cursor + 1,
                               specification);
    }

    static String mixinsInvalidWithoutIdOrType(String elementName)
    {
        return MESSAGES.format("mixins-invalid-without-id-or-type", elementName);
    }

    static String missingFromEnvironment(Class type, Collection<Class> availableTypes)
    {
        List<String> types = CollectionFactory.newList();

        for (Class c : availableTypes)
            types.add(c.getName());

        return MESSAGES.format("missing-from-environment", type.getName(), InternalUtils
                .joinSorted(types));

    }

    static String invalidComponentEventResult(Component component, Object result, String methodDescription,
                                              Collection<Class> configuredResultTypes)
    {
        List<String> classNames = CollectionFactory.newList();

        for (Class c : configuredResultTypes)
            classNames.add(c.getName());

        return MESSAGES.format("invalid-component-event-result", component.getComponentResources()
                .getCompleteId(), result, methodDescription, ClassFabUtils.toJavaClassName(result
                .getClass()), InternalUtils.joinSorted(classNames));
    }

    static String undefinedTapestryAttribute(String elementName, String attributeName, String allowedAttributeName)
    {
        return MESSAGES.format("undefined-tapestry-attribute", elementName, attributeName, allowedAttributeName);
    }

    static String parameterElementNameRequired()
    {
        return MESSAGES.get("parameter-element-name-required");
    }

    static String missingApplicationStatePersistenceStrategy(String name, Collection<String> availableNames)
    {
        return MESSAGES.format("missing-application-state-persistence-strategy", name,
                               InternalUtils.joinSorted(availableNames));
    }

    static String methodIsVoid(String methodName, Class inClass, String propertyExpression)
    {
        return MESSAGES.format("method-is-void", methodName, inClass.getName(), propertyExpression);
    }

    static String methodNotFound(String methodName, Class inClass, String propertyExpression)
    {
        return MESSAGES.format("method-not-found", methodName, inClass.getName(), propertyExpression);
    }

    static String noSuchProperty(Class targetClass, String propertyName, String propertyExpression,
                                 Collection<String> propertyNames)
    {
        return MESSAGES.format("no-such-property", targetClass.getName(), propertyName, propertyExpression,
                               InternalUtils.joinSorted(propertyNames));
    }

    static String writeOnlyProperty(String propertyName, Class clazz, String propertyExpression)
    {
        return MESSAGES.format("write-only-property", propertyName, clazz.getName(), propertyExpression);
    }

    static String requestException(Throwable cause)
    {
        return MESSAGES.format("request-exception", cause);
    }

    static String componentRecursion(String componentClassName)
    {
        return MESSAGES.format("component-recursion", componentClassName);
    }

    static String fieldInjectionError(String className, String fieldName, Throwable cause)
    {
        return MESSAGES.format("field-injection-error", className, fieldName, cause);
    }

    static String clientStateMustBeSerializable(Object newValue)
    {
        return MESSAGES.format("client-state-must-be-serializable", newValue);
    }

    static String corruptClientState()
    {
        return MESSAGES.get("corrupt-client-state");
    }

    static String unclosedAttributeExpression(String expression)
    {
        return MESSAGES.format("unclosed-attribute-expression", expression);
    }

    static String noDisplayForDataType(String datatype)
    {
        return MESSAGES.format("no-display-for-data-type", datatype);
    }

    static String noEditForDataType(String datatype)
    {
        return MESSAGES.format("no-edit-for-data-type", datatype);
    }

    static String missingValidatorConstraint(String validatorType, Class type)
    {
        return MESSAGES.format("missing-validator-constraint", validatorType, type.getName());
    }

    static String resourcesAccessForbidden(String URI)
    {
        return MESSAGES.format("resource-access-forbidden", URI);
    }

    static String noMarkupFromPageRender(org.apache.tapestry.internal.structure.Page page)
    {
        return MESSAGES.format("no-markup-from-page-render", page.getLogicalName());
    }

    static String baseClassInWrongPackage(String parentClassName, String className, String suggestedPackage)
    {
        return MESSAGES.format("base-class-in-wrong-package", parentClassName, className, suggestedPackage);
    }

    static String invalidId(String messageKey, String idValue)
    {
        return MESSAGES.format(messageKey, idValue);
    }

    static String attributeNotAllowed(String elementName)
    {
        return MESSAGES.format("attribute-not-allowed", elementName);
    }

    static String pagePoolExausted(String pageName, Locale locale, int hardLimit)
    {
        return MESSAGES.format("page-pool-exausted", pageName, locale.toString(), hardLimit);
    }
}
