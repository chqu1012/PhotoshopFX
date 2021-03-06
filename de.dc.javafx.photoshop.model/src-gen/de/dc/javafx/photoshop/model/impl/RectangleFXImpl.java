/**
 */
package de.dc.javafx.photoshop.model.impl;

import de.dc.javafx.photoshop.model.PhotoShopFXPackage;
import de.dc.javafx.photoshop.model.RectangleFX;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rectangle FX</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.photoshop.model.impl.RectangleFXImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link de.dc.javafx.photoshop.model.impl.RectangleFXImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link de.dc.javafx.photoshop.model.impl.RectangleFXImpl#getArcWidth <em>Arc Width</em>}</li>
 *   <li>{@link de.dc.javafx.photoshop.model.impl.RectangleFXImpl#getArcHeight <em>Arc Height</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RectangleFXImpl extends ShapeFXImpl implements RectangleFX {
	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final double WIDTH_EDEFAULT = 100.0;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected double width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final double HEIGHT_EDEFAULT = 100.0;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected double height = HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getArcWidth() <em>Arc Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArcWidth()
	 * @generated
	 * @ordered
	 */
	protected static final double ARC_WIDTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getArcWidth() <em>Arc Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArcWidth()
	 * @generated
	 * @ordered
	 */
	protected double arcWidth = ARC_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getArcHeight() <em>Arc Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArcHeight()
	 * @generated
	 * @ordered
	 */
	protected static final double ARC_HEIGHT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getArcHeight() <em>Arc Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArcHeight()
	 * @generated
	 * @ordered
	 */
	protected double arcHeight = ARC_HEIGHT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RectangleFXImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PhotoShopFXPackage.Literals.RECTANGLE_FX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWidth(double newWidth) {
		double oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotoShopFXPackage.RECTANGLE_FX__WIDTH, oldWidth,
					width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeight(double newHeight) {
		double oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotoShopFXPackage.RECTANGLE_FX__HEIGHT, oldHeight,
					height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getArcWidth() {
		return arcWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArcWidth(double newArcWidth) {
		double oldArcWidth = arcWidth;
		arcWidth = newArcWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotoShopFXPackage.RECTANGLE_FX__ARC_WIDTH,
					oldArcWidth, arcWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getArcHeight() {
		return arcHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArcHeight(double newArcHeight) {
		double oldArcHeight = arcHeight;
		arcHeight = newArcHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotoShopFXPackage.RECTANGLE_FX__ARC_HEIGHT,
					oldArcHeight, arcHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PhotoShopFXPackage.RECTANGLE_FX__WIDTH:
			return getWidth();
		case PhotoShopFXPackage.RECTANGLE_FX__HEIGHT:
			return getHeight();
		case PhotoShopFXPackage.RECTANGLE_FX__ARC_WIDTH:
			return getArcWidth();
		case PhotoShopFXPackage.RECTANGLE_FX__ARC_HEIGHT:
			return getArcHeight();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case PhotoShopFXPackage.RECTANGLE_FX__WIDTH:
			setWidth((Double) newValue);
			return;
		case PhotoShopFXPackage.RECTANGLE_FX__HEIGHT:
			setHeight((Double) newValue);
			return;
		case PhotoShopFXPackage.RECTANGLE_FX__ARC_WIDTH:
			setArcWidth((Double) newValue);
			return;
		case PhotoShopFXPackage.RECTANGLE_FX__ARC_HEIGHT:
			setArcHeight((Double) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case PhotoShopFXPackage.RECTANGLE_FX__WIDTH:
			setWidth(WIDTH_EDEFAULT);
			return;
		case PhotoShopFXPackage.RECTANGLE_FX__HEIGHT:
			setHeight(HEIGHT_EDEFAULT);
			return;
		case PhotoShopFXPackage.RECTANGLE_FX__ARC_WIDTH:
			setArcWidth(ARC_WIDTH_EDEFAULT);
			return;
		case PhotoShopFXPackage.RECTANGLE_FX__ARC_HEIGHT:
			setArcHeight(ARC_HEIGHT_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case PhotoShopFXPackage.RECTANGLE_FX__WIDTH:
			return width != WIDTH_EDEFAULT;
		case PhotoShopFXPackage.RECTANGLE_FX__HEIGHT:
			return height != HEIGHT_EDEFAULT;
		case PhotoShopFXPackage.RECTANGLE_FX__ARC_WIDTH:
			return arcWidth != ARC_WIDTH_EDEFAULT;
		case PhotoShopFXPackage.RECTANGLE_FX__ARC_HEIGHT:
			return arcHeight != ARC_HEIGHT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (width: ");
		result.append(width);
		result.append(", height: ");
		result.append(height);
		result.append(", arcWidth: ");
		result.append(arcWidth);
		result.append(", arcHeight: ");
		result.append(arcHeight);
		result.append(')');
		return result.toString();
	}

} //RectangleFXImpl
