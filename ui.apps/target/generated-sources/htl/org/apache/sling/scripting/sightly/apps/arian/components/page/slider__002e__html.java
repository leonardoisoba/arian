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

public final class slider__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

out.write("\r\n    <!--====== SLIDER PART START ======-->\r\n    \r\n    <section id=\"home\" class=\"slider-area pt-100\">\r\n        <div class=\"container-fluid position-relative\">\r\n            <div class=\"slider-active\">\r\n                <div class=\"single-slider\">\r\n                    <div class=\"slider-bg\">\r\n                        <div class=\"row no-gutters align-items-center \">\r\n                            <div class=\"col-lg-4 col-md-5\">\r\n                                <div class=\"slider-product-image d-none d-md-block\">\r\n                                    <img src=\"/content/dam/arian/images/slider/1.jpg\" alt=\"Slider\"/>\r\n                                    <div class=\"slider-discount-tag\">\r\n                                        <p>-50% <br/> OFF</p>\r\n                                    </div>\r\n                                </div> <!-- slider product image -->\r\n                            </div>\r\n                            <div class=\"col-lg-8 col-md-7\">\r\n                                <div class=\"slider-product-content\">\r\n                                    <h1 class=\"slider-title mb-10\" data-animation=\"fadeInUp\" data-delay=\"0.3s\"><span>Sofa</span> and <span>Armchairs</span></h1>\r\n                                    <p class=\"mb-25\" data-animation=\"fadeInUp\" data-delay=\"0.9s\">One day however a small line of blind text by the name of Lorem Ipsum <br/> decided to leave for the far World of Grammar.</p>\r\n                                    <a class=\"main-btn\" href=\"#\" data-animation=\"fadeInUp\" data-delay=\"1.5s\">Explore More <i class=\"lni-chevron-right\"></i></a>\r\n                                </div> <!-- slider product content -->\r\n                            </div>\r\n                        </div> <!-- row -->\r\n                    </div> <!-- container -->\r\n                </div> <!-- single slider -->\r\n\r\n                <div class=\"single-slider\">\r\n                        <div class=\"slider-bg\">\r\n                            <div class=\"row no-gutters align-items-center\">\r\n                                <div class=\"col-lg-4 col-md-5\">\r\n                                    <div class=\"slider-product-image d-none d-md-block\">\r\n                                        <img src=\"/content/dam/arian/images/slider/3.jpg\" alt=\"Slider\"/>\r\n                                        <div class=\"slider-discount-tag\">\r\n                                            <p>-20% <br/> OFF</p>\r\n                                        </div>\r\n                                    </div> <!-- slider product image -->\r\n                                </div>\r\n                                <div class=\"col-lg-8 col-md-7\">\r\n                                    <div class=\"slider-product-content\">\r\n                                        <h1 class=\"slider-title mb-10\" data-animation=\"fadeInUp\" data-delay=\"0.3s\"><span>Winter</span> Sale! is <span>Here</span></h1>\r\n                                        <p class=\"mb-25\" data-animation=\"fadeInUp\" data-delay=\"0.9s\">One day however a small line of blind text by the name of Lorem Ipsum <br/> decided to leave for the far World of Grammar.</p>\r\n                                        <a class=\"main-btn\" href=\"#\" data-animation=\"fadeInUp\" data-delay=\"1.5s\">Explore More <i class=\"lni-chevron-right\"></i></a>\r\n                                    </div> <!-- slider product content -->\r\n                                </div>\r\n                            </div> <!-- row -->\r\n                        </div> <!-- container -->\r\n                </div> <!-- single slider -->\r\n\r\n                <div class=\"single-slider\">\r\n                        <div class=\"slider-bg\">\r\n                            <div class=\"row no-gutters align-items-center\">\r\n                                <div class=\"col-lg-4 col-md-5\">\r\n                                    <div class=\"slider-product-image d-none d-md-block\">\r\n\t\t\t\t\t\t\t\t\t\t<img src=\"/content/dam/arian/images/slider/2.jpg\" alt=\"Slider\"/>\r\n\t\t\t\t\t\t\t\t\t\t<div class=\"slider-discount-tag\">\r\n                                            <p>FREE<br/> QUOTE</p>\r\n                                        </div>\r\n\t\t\t\t\t\t\t\t\t</div> \r\n\t\t\t\t\t\t\t\t\t<!-- slider product image -->\r\n                                </div>\r\n                                <div class=\"col-lg-8 col-md-7\">\r\n                                    <div class=\"slider-product-content\">\r\n                                        <h1 class=\"slider-title mb-10\" data-animation=\"fadeInUp\" data-delay=\"0.3s\"><span>Get</span> a Free <span>Quote</span></h1>\r\n                                        <p class=\"mb-25\" data-animation=\"fadeInUp\" data-delay=\"0.9s\">One day however a small line of blind text by the name of Lorem Ipsum <br/> decided to leave for the far World of Grammar.</p>\r\n                                        <a class=\"main-btn\" href=\"#contact\" data-animation=\"fadeInUp\" data-delay=\"1.5s\">Contact Us <i class=\"lni-chevron-right\"></i></a>\r\n                                    </div> <!-- slider product content -->\r\n                                </div>\r\n                            </div> <!-- row -->\r\n                        </div> <!-- container -->\r\n                </div> <!-- single slider -->\r\n            </div> <!-- slider active -->\r\n            <div class=\"slider-social\">\r\n                <div class=\"row justify-content-end\">\r\n                    <div class=\"col-lg-7 col-md-6\">\r\n                        <ul class=\"social text-right\">\r\n                            <li><a href=\"#\"><i class=\"lni-facebook-filled\"></i></a></li>\r\n                            <li><a href=\"#\"><i class=\"lni-twitter-original\"></i></a></li>\r\n                            <li><a href=\"#\"><i class=\"lni-instagram\"></i></a></li>\r\n                        </ul>\r\n                    </div>\r\n                </div>\r\n            </div>\r\n        </div> <!-- container fluid -->\r\n    </section>\r\n    \r\n    <!--====== SLIDER PART ENDS ======-->");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

