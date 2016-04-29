/**
 * Copyright (c) 2011-2013 EclipseSource Muenchen GmbH and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Edgar Mueller - initial API and implementation
 */
package org.eclipse.emf.ecp.view.dynamictree.model.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecp.view.dynamictree.model.util.ModelAdapterFactory;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged
 * fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ModelItemProviderAdapterFactory extends ModelAdapterFactory implements ComposeableAdapterFactory,
	IChangeNotifier, IDisposable
{
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public ModelItemProviderAdapterFactory()
	{
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all
	 * {@link org.eclipse.emf.ecp.view.dynamictree.model.DynamicContainmentTree} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected DynamicContainmentTreeItemProvider dynamicContainmentTreeItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.emf.ecp.view.dynamictree.model.DynamicContainmentTree}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Adapter createDynamicContainmentTreeAdapter()
	{
		if (dynamicContainmentTreeItemProvider == null) {
			dynamicContainmentTreeItemProvider = new DynamicContainmentTreeItemProvider(this);
		}

		return dynamicContainmentTreeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all
	 * {@link org.eclipse.emf.ecp.view.dynamictree.model.DynamicContainmentItem} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected DynamicContainmentItemItemProvider dynamicContainmentItemItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.emf.ecp.view.dynamictree.model.DynamicContainmentItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Adapter createDynamicContainmentItemAdapter()
	{
		if (dynamicContainmentItemItemProvider == null) {
			dynamicContainmentItemItemProvider = new DynamicContainmentItemItemProvider(this);
		}

		return dynamicContainmentItemItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.emf.ecp.view.dynamictree.model.TestElement}
	 * instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected TestElementItemProvider testElementItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.emf.ecp.view.dynamictree.model.TestElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Adapter createTestElementAdapter()
	{
		if (testElementItemProvider == null) {
			testElementItemProvider = new TestElementItemProvider(this);
		}

		return testElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.emf.ecp.view.dynamictree.model.DomainRoot}
	 * instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected DomainRootItemProvider domainRootItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.emf.ecp.view.dynamictree.model.DomainRoot}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Adapter createDomainRootAdapter()
	{
		if (domainRootItemProvider == null) {
			domainRootItemProvider = new DomainRootItemProvider(this);
		}

		return domainRootItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all
	 * {@link org.eclipse.emf.ecp.view.dynamictree.model.DomainIntermediate} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected DomainIntermediateItemProvider domainIntermediateItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.emf.ecp.view.dynamictree.model.DomainIntermediate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Adapter createDomainIntermediateAdapter()
	{
		if (domainIntermediateItemProvider == null) {
			domainIntermediateItemProvider = new DomainIntermediateItemProvider(this);
		}

		return domainIntermediateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all
	 * {@link org.eclipse.emf.ecp.view.dynamictree.model.TestElementContainer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected TestElementContainerItemProvider testElementContainerItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.emf.ecp.view.dynamictree.model.TestElementContainer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Adapter createTestElementContainerAdapter()
	{
		if (testElementContainerItemProvider == null) {
			testElementContainerItemProvider = new TestElementContainerItemProvider(this);
		}

		return testElementContainerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all
	 * {@link org.eclipse.emf.ecp.view.dynamictree.model.DynamicContainmentTreeDomainModelReference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected DynamicContainmentTreeDomainModelReferenceItemProvider dynamicContainmentTreeDomainModelReferenceItemProvider;

	/**
	 * This creates an adapter for a
	 * {@link org.eclipse.emf.ecp.view.dynamictree.model.DynamicContainmentTreeDomainModelReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Adapter createDynamicContainmentTreeDomainModelReferenceAdapter() {
		if (dynamicContainmentTreeDomainModelReferenceItemProvider == null) {
			dynamicContainmentTreeDomainModelReferenceItemProvider = new DynamicContainmentTreeDomainModelReferenceItemProvider(
				this);
		}

		return dynamicContainmentTreeDomainModelReferenceItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory()
	{
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory)
	{
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type)
	{
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type)
	{
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type)
	{
		if (isFactoryForType(type)) {
			final Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || ((Class<?>) type).isInstance(adapter)) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener)
	{
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener)
	{
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification)
	{
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void dispose()
	{
		if (dynamicContainmentTreeItemProvider != null) {
			dynamicContainmentTreeItemProvider.dispose();
		}
		if (dynamicContainmentItemItemProvider != null) {
			dynamicContainmentItemItemProvider.dispose();
		}
		if (testElementItemProvider != null) {
			testElementItemProvider.dispose();
		}
		if (domainRootItemProvider != null) {
			domainRootItemProvider.dispose();
		}
		if (domainIntermediateItemProvider != null) {
			domainIntermediateItemProvider.dispose();
		}
		if (testElementContainerItemProvider != null) {
			testElementContainerItemProvider.dispose();
		}
		if (dynamicContainmentTreeDomainModelReferenceItemProvider != null) {
			dynamicContainmentTreeDomainModelReferenceItemProvider.dispose();
		}
	}

}
