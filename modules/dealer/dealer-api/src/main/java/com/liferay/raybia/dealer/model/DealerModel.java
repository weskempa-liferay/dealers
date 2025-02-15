/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.raybia.dealer.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.LocaleException;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.LocalizedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;

import java.math.BigDecimal;

import java.util.Date;
import java.util.Locale;
import java.util.Map;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the Dealer service. Represents a row in the &quot;Raybia_Dealer&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.liferay.raybia.dealer.model.impl.DealerModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.liferay.raybia.dealer.model.impl.DealerImpl</code>.
 * </p>
 *
 * @author Peter Richards
 * @see Dealer
 * @generated
 */
@ProviderType
public interface DealerModel
	extends BaseModel<Dealer>, GroupedModel, LocalizedModel, ShardedModel,
			StagedAuditedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a dealer model instance should use the {@link Dealer} interface instead.
	 */

	/**
	 * Returns the primary key of this dealer.
	 *
	 * @return the primary key of this dealer
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this dealer.
	 *
	 * @param primaryKey the primary key of this dealer
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this dealer.
	 *
	 * @return the uuid of this dealer
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this dealer.
	 *
	 * @param uuid the uuid of this dealer
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the dealer ID of this dealer.
	 *
	 * @return the dealer ID of this dealer
	 */
	public long getDealerId();

	/**
	 * Sets the dealer ID of this dealer.
	 *
	 * @param dealerId the dealer ID of this dealer
	 */
	public void setDealerId(long dealerId);

	/**
	 * Returns the group ID of this dealer.
	 *
	 * @return the group ID of this dealer
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this dealer.
	 *
	 * @param groupId the group ID of this dealer
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this dealer.
	 *
	 * @return the company ID of this dealer
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this dealer.
	 *
	 * @param companyId the company ID of this dealer
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this dealer.
	 *
	 * @return the user ID of this dealer
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this dealer.
	 *
	 * @param userId the user ID of this dealer
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this dealer.
	 *
	 * @return the user uuid of this dealer
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this dealer.
	 *
	 * @param userUuid the user uuid of this dealer
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this dealer.
	 *
	 * @return the user name of this dealer
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this dealer.
	 *
	 * @param userName the user name of this dealer
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this dealer.
	 *
	 * @return the create date of this dealer
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this dealer.
	 *
	 * @param createDate the create date of this dealer
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this dealer.
	 *
	 * @return the modified date of this dealer
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this dealer.
	 *
	 * @param modifiedDate the modified date of this dealer
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the name of this dealer.
	 *
	 * @return the name of this dealer
	 */
	public String getName();

	/**
	 * Returns the localized name of this dealer in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param locale the locale of the language
	 * @return the localized name of this dealer
	 */
	@AutoEscape
	public String getName(Locale locale);

	/**
	 * Returns the localized name of this dealer in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param locale the local of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized name of this dealer. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
	 */
	@AutoEscape
	public String getName(Locale locale, boolean useDefault);

	/**
	 * Returns the localized name of this dealer in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @return the localized name of this dealer
	 */
	@AutoEscape
	public String getName(String languageId);

	/**
	 * Returns the localized name of this dealer in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized name of this dealer
	 */
	@AutoEscape
	public String getName(String languageId, boolean useDefault);

	@AutoEscape
	public String getNameCurrentLanguageId();

	@AutoEscape
	public String getNameCurrentValue();

	/**
	 * Returns a map of the locales and localized names of this dealer.
	 *
	 * @return the locales and localized names of this dealer
	 */
	public Map<Locale, String> getNameMap();

	/**
	 * Sets the name of this dealer.
	 *
	 * @param name the name of this dealer
	 */
	public void setName(String name);

	/**
	 * Sets the localized name of this dealer in the language.
	 *
	 * @param name the localized name of this dealer
	 * @param locale the locale of the language
	 */
	public void setName(String name, Locale locale);

	/**
	 * Sets the localized name of this dealer in the language, and sets the default locale.
	 *
	 * @param name the localized name of this dealer
	 * @param locale the locale of the language
	 * @param defaultLocale the default locale
	 */
	public void setName(String name, Locale locale, Locale defaultLocale);

	public void setNameCurrentLanguageId(String languageId);

	/**
	 * Sets the localized names of this dealer from the map of locales and localized names.
	 *
	 * @param nameMap the locales and localized names of this dealer
	 */
	public void setNameMap(Map<Locale, String> nameMap);

	/**
	 * Sets the localized names of this dealer from the map of locales and localized names, and sets the default locale.
	 *
	 * @param nameMap the locales and localized names of this dealer
	 * @param defaultLocale the default locale
	 */
	public void setNameMap(Map<Locale, String> nameMap, Locale defaultLocale);

	/**
	 * Returns the street of this dealer.
	 *
	 * @return the street of this dealer
	 */
	public String getStreet();

	/**
	 * Returns the localized street of this dealer in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param locale the locale of the language
	 * @return the localized street of this dealer
	 */
	@AutoEscape
	public String getStreet(Locale locale);

	/**
	 * Returns the localized street of this dealer in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param locale the local of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized street of this dealer. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
	 */
	@AutoEscape
	public String getStreet(Locale locale, boolean useDefault);

	/**
	 * Returns the localized street of this dealer in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @return the localized street of this dealer
	 */
	@AutoEscape
	public String getStreet(String languageId);

	/**
	 * Returns the localized street of this dealer in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized street of this dealer
	 */
	@AutoEscape
	public String getStreet(String languageId, boolean useDefault);

	@AutoEscape
	public String getStreetCurrentLanguageId();

	@AutoEscape
	public String getStreetCurrentValue();

	/**
	 * Returns a map of the locales and localized streets of this dealer.
	 *
	 * @return the locales and localized streets of this dealer
	 */
	public Map<Locale, String> getStreetMap();

	/**
	 * Sets the street of this dealer.
	 *
	 * @param street the street of this dealer
	 */
	public void setStreet(String street);

	/**
	 * Sets the localized street of this dealer in the language.
	 *
	 * @param street the localized street of this dealer
	 * @param locale the locale of the language
	 */
	public void setStreet(String street, Locale locale);

	/**
	 * Sets the localized street of this dealer in the language, and sets the default locale.
	 *
	 * @param street the localized street of this dealer
	 * @param locale the locale of the language
	 * @param defaultLocale the default locale
	 */
	public void setStreet(String street, Locale locale, Locale defaultLocale);

	public void setStreetCurrentLanguageId(String languageId);

	/**
	 * Sets the localized streets of this dealer from the map of locales and localized streets.
	 *
	 * @param streetMap the locales and localized streets of this dealer
	 */
	public void setStreetMap(Map<Locale, String> streetMap);

	/**
	 * Sets the localized streets of this dealer from the map of locales and localized streets, and sets the default locale.
	 *
	 * @param streetMap the locales and localized streets of this dealer
	 * @param defaultLocale the default locale
	 */
	public void setStreetMap(
		Map<Locale, String> streetMap, Locale defaultLocale);

	/**
	 * Returns the locality of this dealer.
	 *
	 * @return the locality of this dealer
	 */
	public String getLocality();

	/**
	 * Returns the localized locality of this dealer in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param locale the locale of the language
	 * @return the localized locality of this dealer
	 */
	@AutoEscape
	public String getLocality(Locale locale);

	/**
	 * Returns the localized locality of this dealer in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param locale the local of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized locality of this dealer. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
	 */
	@AutoEscape
	public String getLocality(Locale locale, boolean useDefault);

	/**
	 * Returns the localized locality of this dealer in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @return the localized locality of this dealer
	 */
	@AutoEscape
	public String getLocality(String languageId);

	/**
	 * Returns the localized locality of this dealer in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized locality of this dealer
	 */
	@AutoEscape
	public String getLocality(String languageId, boolean useDefault);

	@AutoEscape
	public String getLocalityCurrentLanguageId();

	@AutoEscape
	public String getLocalityCurrentValue();

	/**
	 * Returns a map of the locales and localized localities of this dealer.
	 *
	 * @return the locales and localized localities of this dealer
	 */
	public Map<Locale, String> getLocalityMap();

	/**
	 * Sets the locality of this dealer.
	 *
	 * @param locality the locality of this dealer
	 */
	public void setLocality(String locality);

	/**
	 * Sets the localized locality of this dealer in the language.
	 *
	 * @param locality the localized locality of this dealer
	 * @param locale the locale of the language
	 */
	public void setLocality(String locality, Locale locale);

	/**
	 * Sets the localized locality of this dealer in the language, and sets the default locale.
	 *
	 * @param locality the localized locality of this dealer
	 * @param locale the locale of the language
	 * @param defaultLocale the default locale
	 */
	public void setLocality(
		String locality, Locale locale, Locale defaultLocale);

	public void setLocalityCurrentLanguageId(String languageId);

	/**
	 * Sets the localized localities of this dealer from the map of locales and localized localities.
	 *
	 * @param localityMap the locales and localized localities of this dealer
	 */
	public void setLocalityMap(Map<Locale, String> localityMap);

	/**
	 * Sets the localized localities of this dealer from the map of locales and localized localities, and sets the default locale.
	 *
	 * @param localityMap the locales and localized localities of this dealer
	 * @param defaultLocale the default locale
	 */
	public void setLocalityMap(
		Map<Locale, String> localityMap, Locale defaultLocale);

	/**
	 * Returns the state of this dealer.
	 *
	 * @return the state of this dealer
	 */
	public String getState();

	/**
	 * Returns the localized state of this dealer in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param locale the locale of the language
	 * @return the localized state of this dealer
	 */
	@AutoEscape
	public String getState(Locale locale);

	/**
	 * Returns the localized state of this dealer in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param locale the local of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized state of this dealer. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
	 */
	@AutoEscape
	public String getState(Locale locale, boolean useDefault);

	/**
	 * Returns the localized state of this dealer in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @return the localized state of this dealer
	 */
	@AutoEscape
	public String getState(String languageId);

	/**
	 * Returns the localized state of this dealer in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized state of this dealer
	 */
	@AutoEscape
	public String getState(String languageId, boolean useDefault);

	@AutoEscape
	public String getStateCurrentLanguageId();

	@AutoEscape
	public String getStateCurrentValue();

	/**
	 * Returns a map of the locales and localized states of this dealer.
	 *
	 * @return the locales and localized states of this dealer
	 */
	public Map<Locale, String> getStateMap();

	/**
	 * Sets the state of this dealer.
	 *
	 * @param state the state of this dealer
	 */
	public void setState(String state);

	/**
	 * Sets the localized state of this dealer in the language.
	 *
	 * @param state the localized state of this dealer
	 * @param locale the locale of the language
	 */
	public void setState(String state, Locale locale);

	/**
	 * Sets the localized state of this dealer in the language, and sets the default locale.
	 *
	 * @param state the localized state of this dealer
	 * @param locale the locale of the language
	 * @param defaultLocale the default locale
	 */
	public void setState(String state, Locale locale, Locale defaultLocale);

	public void setStateCurrentLanguageId(String languageId);

	/**
	 * Sets the localized states of this dealer from the map of locales and localized states.
	 *
	 * @param stateMap the locales and localized states of this dealer
	 */
	public void setStateMap(Map<Locale, String> stateMap);

	/**
	 * Sets the localized states of this dealer from the map of locales and localized states, and sets the default locale.
	 *
	 * @param stateMap the locales and localized states of this dealer
	 * @param defaultLocale the default locale
	 */
	public void setStateMap(Map<Locale, String> stateMap, Locale defaultLocale);

	/**
	 * Returns the postal code of this dealer.
	 *
	 * @return the postal code of this dealer
	 */
	@AutoEscape
	public String getPostalCode();

	/**
	 * Sets the postal code of this dealer.
	 *
	 * @param postalCode the postal code of this dealer
	 */
	public void setPostalCode(String postalCode);

	/**
	 * Returns the email address of this dealer.
	 *
	 * @return the email address of this dealer
	 */
	@AutoEscape
	public String getEmailAddress();

	/**
	 * Sets the email address of this dealer.
	 *
	 * @param emailAddress the email address of this dealer
	 */
	public void setEmailAddress(String emailAddress);

	/**
	 * Returns the phone number of this dealer.
	 *
	 * @return the phone number of this dealer
	 */
	@AutoEscape
	public String getPhoneNumber();

	/**
	 * Sets the phone number of this dealer.
	 *
	 * @param phoneNumber the phone number of this dealer
	 */
	public void setPhoneNumber(String phoneNumber);

	/**
	 * Returns the opening hours of this dealer.
	 *
	 * @return the opening hours of this dealer
	 */
	public String getOpeningHours();

	/**
	 * Returns the localized opening hours of this dealer in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param locale the locale of the language
	 * @return the localized opening hours of this dealer
	 */
	@AutoEscape
	public String getOpeningHours(Locale locale);

	/**
	 * Returns the localized opening hours of this dealer in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param locale the local of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized opening hours of this dealer. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
	 */
	@AutoEscape
	public String getOpeningHours(Locale locale, boolean useDefault);

	/**
	 * Returns the localized opening hours of this dealer in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @return the localized opening hours of this dealer
	 */
	@AutoEscape
	public String getOpeningHours(String languageId);

	/**
	 * Returns the localized opening hours of this dealer in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized opening hours of this dealer
	 */
	@AutoEscape
	public String getOpeningHours(String languageId, boolean useDefault);

	@AutoEscape
	public String getOpeningHoursCurrentLanguageId();

	@AutoEscape
	public String getOpeningHoursCurrentValue();

	/**
	 * Returns a map of the locales and localized opening hourses of this dealer.
	 *
	 * @return the locales and localized opening hourses of this dealer
	 */
	public Map<Locale, String> getOpeningHoursMap();

	/**
	 * Sets the opening hours of this dealer.
	 *
	 * @param openingHours the opening hours of this dealer
	 */
	public void setOpeningHours(String openingHours);

	/**
	 * Sets the localized opening hours of this dealer in the language.
	 *
	 * @param openingHours the localized opening hours of this dealer
	 * @param locale the locale of the language
	 */
	public void setOpeningHours(String openingHours, Locale locale);

	/**
	 * Sets the localized opening hours of this dealer in the language, and sets the default locale.
	 *
	 * @param openingHours the localized opening hours of this dealer
	 * @param locale the locale of the language
	 * @param defaultLocale the default locale
	 */
	public void setOpeningHours(
		String openingHours, Locale locale, Locale defaultLocale);

	public void setOpeningHoursCurrentLanguageId(String languageId);

	/**
	 * Sets the localized opening hourses of this dealer from the map of locales and localized opening hourses.
	 *
	 * @param openingHoursMap the locales and localized opening hourses of this dealer
	 */
	public void setOpeningHoursMap(Map<Locale, String> openingHoursMap);

	/**
	 * Sets the localized opening hourses of this dealer from the map of locales and localized opening hourses, and sets the default locale.
	 *
	 * @param openingHoursMap the locales and localized opening hourses of this dealer
	 * @param defaultLocale the default locale
	 */
	public void setOpeningHoursMap(
		Map<Locale, String> openingHoursMap, Locale defaultLocale);

	/**
	 * Returns the latitude of this dealer.
	 *
	 * @return the latitude of this dealer
	 */
	public BigDecimal getLatitude();

	/**
	 * Sets the latitude of this dealer.
	 *
	 * @param latitude the latitude of this dealer
	 */
	public void setLatitude(BigDecimal latitude);

	/**
	 * Returns the longitude of this dealer.
	 *
	 * @return the longitude of this dealer
	 */
	public BigDecimal getLongitude();

	/**
	 * Sets the longitude of this dealer.
	 *
	 * @param longitude the longitude of this dealer
	 */
	public void setLongitude(BigDecimal longitude);

	@Override
	public String[] getAvailableLanguageIds();

	@Override
	public String getDefaultLanguageId();

	@Override
	public void prepareLocalizedFieldsForImport() throws LocaleException;

	@Override
	public void prepareLocalizedFieldsForImport(Locale defaultImportLocale)
		throws LocaleException;

}