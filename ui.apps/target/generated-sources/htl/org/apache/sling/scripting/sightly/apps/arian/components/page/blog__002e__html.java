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

public final class blog__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

out.write("<!--======  BLOG PART START ======-->\r\n    \r\n    <section id=\"blog\" class=\"blog-area pt-125\">\r\n        <div class=\"container\">\r\n            <div class=\"row justify-content-center\">\r\n                <div class=\"col-lg-6\">\r\n                    <div class=\"section-title text-center pb-25\">\r\n                        <h3 class=\"title mb-15\">From The Blog</h3>\r\n                        <p>There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form.</p>\r\n                    </div> <!-- section title -->\r\n                </div>\r\n            </div> <!-- row -->\r\n            <div class=\"row justify-content-center\">\r\n                <div class=\"col-lg-4 col-md-6\">\r\n                    <div class=\"single-blog mt-30\">\r\n                        <div class=\"blog-image\">\r\n                            <img src=\"/content/dam/arian/images/blog/b-1.jpg\" alt=\"Blog\"/>\r\n                        </div>\r\n                        <div class=\"blog-content\">\r\n                            <div class=\"content\">\r\n                                <h4 class=\"title\"><a href=\"#\">Rowan an orangutan known  & loved</a></h4>\r\n                                <span>25 JULY, 2022</span>\r\n                            </div>\r\n                            <div class=\"meta d-flex justify-content-between align-items-center\">\r\n                                <div class=\"meta-admin d-flex align-items-center\">\r\n                                    <div class=\"image\">\r\n                                        <a href=\"#\"><img src=\"/content/dam/arian/images/blog/admin.jpg\" alt=\"Admin\"/></a>\r\n                                    </div>\r\n                                    <div class=\"admin-title\">\r\n                                        <h6 class=\"title\"><a href=\"#\">J. PARKER</a></h6>\r\n                                    </div>\r\n                                </div>  <!-- meta admin -->\r\n                                <div class=\"meta-icon\">\r\n                                    <ul>\r\n                                        <li><a href=\"#\"><i class=\"lni-share\"></i></a></li>\r\n                                        <li><a href=\"#\"><i class=\"lni-heart\"></i></a></li>\r\n                                    </ul>\r\n                                </div> <!-- meta icon -->\r\n                            </div> <!-- meta -->\r\n                        </div>\r\n                    </div> <!-- single blog -->\r\n                </div>\r\n                <div class=\"col-lg-4 col-md-6\">\r\n                    <div class=\"single-blog mt-30\">\r\n                        <div class=\"blog-image\">\r\n                            <img src=\"/content/dam/arian/images/blog/b-2.jpg\" alt=\"Blog\"/>\r\n                        </div>\r\n                        <div class=\"blog-content\">\r\n                            <div class=\"content\">\r\n                                <h4 class=\"title\"><a href=\"#\">Rowan an orangutan known  & loved</a></h4>\r\n                                <span>25 JULY, 2022</span>\r\n                            </div>\r\n                            <div class=\"meta d-flex justify-content-between align-items-center\">\r\n                                <div class=\"meta-admin d-flex align-items-center\">\r\n                                    <div class=\"image\">\r\n                                        <a href=\"#\"><img src=\"/content/dam/arian/images/blog/admin.jpg\" alt=\"Admin\"/></a>\r\n                                    </div>\r\n                                    <div class=\"admin-title\">\r\n                                        <h6 class=\"title\"><a href=\"#\">J. PARKER</a></h6>\r\n                                    </div>\r\n                                </div>  <!-- meta admin -->\r\n                                <div class=\"meta-icon\">\r\n                                    <ul>\r\n                                        <li><a href=\"#\"><i class=\"lni-share\"></i></a></li>\r\n                                        <li><a href=\"#\"><i class=\"lni-heart\"></i></a></li>\r\n                                    </ul>\r\n                                </div> <!-- meta icon -->\r\n                            </div> <!-- meta -->\r\n                        </div>\r\n                    </div> <!-- single blog -->\r\n                </div>\r\n                <div class=\"col-lg-4 col-md-6\">\r\n                    <div class=\"single-blog mt-30\">\r\n                        <div class=\"blog-image\">\r\n                            <img src=\"/content/dam/arian/images/blog/b-3.jpg\" alt=\"Blog\"/>\r\n                        </div>\r\n                        <div class=\"blog-content\">\r\n                            <div class=\"content\">\r\n                                <h4 class=\"title\"><a href=\"#\">Rowan an orangutan known  & loved</a></h4>\r\n                                <span>25 JULY, 2022</span>\r\n                            </div>\r\n                            <div class=\"meta d-flex justify-content-between align-items-center\">\r\n                                <div class=\"meta-admin d-flex align-items-center\">\r\n                                    <div class=\"image\">\r\n                                        <a href=\"#\"><img src=\"/content/dam/arian/images/blog/admin.jpg\" alt=\"Admin\"/></a>\r\n                                    </div>\r\n                                    <div class=\"admin-title\">\r\n                                        <h6 class=\"title\"><a href=\"#\">J. PARKER</a></h6>\r\n                                    </div>\r\n                                </div>  <!-- meta admin -->\r\n                                <div class=\"meta-icon\">\r\n                                    <ul>\r\n                                        <li><a href=\"#\"><i class=\"lni-share\"></i></a></li>\r\n                                        <li><a href=\"#\"><i class=\"lni-heart\"></i></a></li>\r\n                                    </ul>\r\n                                </div> <!-- meta icon -->\r\n                            </div> <!-- meta -->\r\n                        </div>\r\n                    </div> <!-- single blog -->\r\n                </div>\r\n            </div> <!-- row -->\r\n        </div> <!-- container -->\r\n    </section>\r\n    \r\n    <!--======  BLOG PART ENDS ======-->>");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

