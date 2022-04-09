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
package org.apache.sling.scripting.sightly.apps.arian.components.image__002d__gallery__002d__item;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class image__002d__gallery__002d__item__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_imagegalleryitem = null;
out.write("\t\t\t");
_global_imagegalleryitem = renderContext.call("use", com.arian.core.models.ImageGalleryItem.class.getName(), obj());
out.write("<div class=\"single-slider\">\r\n                        <div class=\"slider-bg\">\r\n                            <div class=\"row no-gutters align-items-center\">\r\n                                <div class=\"col-lg-4 col-md-5\">\r\n                                    <div class=\"slider-product-image d-none d-md-block\">\r\n                                        <img");
{
    Object var_attrvalue0 = renderContext.getObjectModel().resolveProperty(_global_imagegalleryitem, "image");
    {
        Object var_attrcontent1 = renderContext.call("xss", var_attrvalue0, "uri");
        {
            boolean var_shoulddisplayattr3 = (((null != var_attrcontent1) && (!"".equals(var_attrcontent1))) && ((!"".equals(var_attrvalue0)) && (!((Object)false).equals(var_attrvalue0))));
            if (var_shoulddisplayattr3) {
                out.write(" src");
                {
                    boolean var_istrueattr2 = (var_attrvalue0.equals(true));
                    if (!var_istrueattr2) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent1));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write(" alt=\"imageAlt\"/>\r\n                                        <div class=\"slider-discount-tag\">\r\n                                            <p>-20% <br/> OFF</p>\r\n                                        </div>\r\n                                    </div> <!-- slider product image -->\r\n                                </div>\r\n                                <div class=\"col-lg-8 col-md-7\">\r\n                                    <div class=\"slider-product-content\">\r\n                                        <h1 class=\"slider-title mb-10\" data-animation=\"fadeInUp\" data-delay=\"0.3s\"><span>Winter</span> Sale! is <span>Here</span></h1>\r\n                                        <p class=\"mb-25\" data-animation=\"fadeInUp\" data-delay=\"0.9s\">One day however a small line of blind text by the name of Lorem Ipsum <br/> decided to leave for the far World of Grammar.</p>\r\n                                        <a class=\"main-btn\" href=\"#\" data-animation=\"fadeInUp\" data-delay=\"1.5s\">Explore More <i class=\"lni-chevron-right\"></i></a>\r\n                                    </div> <!-- slider product content -->\r\n                                </div>\r\n                            </div> <!-- row -->\r\n                        </div> <!-- container -->\r\n                </div> <!-- single slider -->");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

