/*
 * Copyright (c) 2014 Villu Ruusmann
 */
package org.jpmml.schema;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Marks a feature that was removed in the specified PMML schema version.
 *
 * @see Added
 */
@Retention (
	value = RetentionPolicy.RUNTIME
)
@Target (
	value = {ElementType.TYPE, ElementType.FIELD}
)
public @interface Removed {

	Version value();
}