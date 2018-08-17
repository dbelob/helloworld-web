/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package acme;

import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
//import javax.inject.Named;

/**
 * A typical simple backing bean, that is backed to <code>helloWorld.xhtml</code>
 */
@ManagedBean(name = "helloWorld")
//@Named("helloWorld")
@RequestScoped
public class HelloWorldController {
    public HelloWorldController() {
    }

    /**
     * Provides a convenient means of determining the JSF specification version.
     *
     * @return JSF Specification version, e.g. 2.1
     */
    public String getSpecificationVersion() {
        return FacesContext.getCurrentInstance().getClass().getPackage().getSpecificationVersion();
    }

    /**
     * Provides a convenient means of determining the JSF implementation version.
     *
     * @return JSF Implementation version, e.g. 2.1.26
     */
    public String getImplementationVersion() {
        return FacesContext.getCurrentInstance().getClass().getPackage().getImplementationVersion();
    }

    /**
     * Provides a convenient means of determining the JSF implementation Title.
     *
     * @return JSF implementation title, e.g. Mojarra.
     */
    public String getImplementationTitle() {
        return FacesContext.getCurrentInstance().getClass().getPackage().getImplementationTitle();
    }
}