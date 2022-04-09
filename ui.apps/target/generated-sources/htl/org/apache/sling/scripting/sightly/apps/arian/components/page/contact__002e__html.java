/*******************************************************************************
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
 ******************************************************************************/
package org.apache.sling.scripting.sightly.apps.arian.components.page;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class contact__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

out.write(" <!--====== CONTACT PART START ======-->\r\n    \r\n    <section id=\"contact\" class=\"contact-area pt-115\">\r\n        <div class=\"container\">\r\n            <div class=\"row justify-content-center\">\r\n                <div class=\"col-lg-6\">\r\n                    <div class=\"contact-title text-center\">\r\n                        <h2 class=\"title\">Get In Touch</h2>\r\n                    </div> <!-- contact title -->\r\n                </div>\r\n            </div> <!-- row -->\r\n            <div class=\"contact-box mt-70\">\r\n                <div class=\"row\">\r\n                    <div class=\"col-lg-4\">\r\n                        <div class=\"contact-info pt-25\">\r\n                            <h4 class=\"info-title\">Contact Info</h4>\r\n                            <ul>\r\n                                <li>\r\n                                    <div class=\"single-info mt-30\">\r\n                                        <div class=\"info-icon\">\r\n                                            <i class=\"lni-phone-handset\"></i>\r\n                                        </div>\r\n                                        <div class=\"info-content\">\r\n                                            <p>+88 1234 56789</p>\r\n                                        </div>\r\n                                    </div> <!-- single info -->\r\n                                </li>\r\n                                <li>\r\n                                    <div class=\"single-info mt-30\">\r\n                                        <div class=\"info-icon\">\r\n                                            <i class=\"lni-envelope\"></i>\r\n                                        </div>\r\n                                        <div class=\"info-content\">\r\n                                            <p>contact@yourmail.com</p>\r\n                                        </div>\r\n                                    </div> <!-- single info -->\r\n                                </li>\r\n                                <li>\r\n                                    <div class=\"single-info mt-30\">\r\n                                        <div class=\"info-icon\">\r\n                                            <i class=\"lni-home\"></i>\r\n                                        </div>\r\n                                        <div class=\"info-content\">\r\n                                            <p>203, Envato Labs, Behind Alis Steet,Australia</p>\r\n                                        </div>\r\n                                    </div> <!-- single info -->\r\n                                </li>\r\n                            </ul>\r\n                        </div> <!-- contact info -->\r\n                    </div> \r\n                    <div class=\"col-lg-8\">\r\n                        <div class=\"contact-form\">\r\n                            <form id=\"contact-form\" action=\"assets/contact.php\" method=\"post\" data-toggle=\"validator\">\r\n                                <div class=\"row\">\r\n                                    <div class=\"col-lg-6\">\r\n                                        <div class=\"single-form form-group\">\r\n                                            <input type=\"text\" name=\"name\" placeholder=\"Enter Your Name\" data-error=\"Name is required.\" required=\"required\"/>\r\n                                            <div class=\"help-block with-errors\"></div>\r\n                                        </div> <!-- single form -->\r\n                                    </div>\r\n                                    <div class=\"col-lg-6\">\r\n                                        <div class=\"single-form form-group\">\r\n                                            <input type=\"email\" name=\"email\" placeholder=\"Enter Your Email\" data-error=\"Valid email is required.\" required=\"required\"/>\r\n                                            <div class=\"help-block with-errors\"></div>\r\n                                        </div> <!-- single form -->\r\n                                    </div>\r\n                                    <div class=\"col-lg-12\">\r\n                                        <div class=\"single-form form-group\">\r\n                                            <textarea name=\"message\" placeholder=\"Enter Your Message\" data-error=\"Please,leave us a message.\" required=\"required\"></textarea>\r\n                                            <div class=\"help-block with-errors\"></div>\r\n                                        </div> <!-- single form -->\r\n                                    </div>\r\n                                    <p class=\"form-message\"></p>\r\n                                    <div class=\"col-lg-12\">\r\n                                        <div class=\"single-form form-group\">\r\n                                            <button class=\"main-btn\" type=\"submit\">CONTACT NOW</button>\r\n                                        </div> <!-- single form -->\r\n                                    </div>\r\n                                </div> <!-- row -->\r\n                            </form>\r\n                        </div> <!-- row -->\r\n                    </div> \r\n                </div> <!-- row -->\r\n            </div> <!-- contact box -->\r\n        </div> <!-- container -->\r\n    </section>\r\n    \r\n    <!--====== CONTACT PART ENDS ======-->");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

