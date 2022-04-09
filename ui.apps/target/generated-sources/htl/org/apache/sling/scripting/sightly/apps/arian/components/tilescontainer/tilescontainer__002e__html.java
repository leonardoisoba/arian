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
package org.apache.sling.scripting.sightly.apps.arian.components.tilescontainer;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class tilescontainer__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_tiles = null;
out.write("<!--====== TEAM PART START ======-->\r\n    \r\n    <section id=\"team\" class=\"team-area pt-125 pb-130\">\r\n        <div class=\"container\">\r\n            <div class=\"row justify-content-center\">\r\n                <div class=\"col-lg-6\">\r\n                    ");
_global_tiles = renderContext.call("use", com.arian.core.models.TilesContainerModel.class.getName(), obj());
out.write("<div class=\"section-title text-center pb-25\">\r\n\t                    <h3 class=\"title mb-15\">");
{
    String var_0 = (("\r\n\t                    \t" + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_tiles, "title"), "text"))) + "\r\n\t\t\t\t\t    ");
    out.write(renderContext.getObjectModel().toString(var_0));
}
out.write("</h3>\r\n                        ");
{
    Object var_testvariable1 = renderContext.getObjectModel().resolveProperty(_global_tiles, "subtitle");
    if (renderContext.getObjectModel().toBoolean(var_testvariable1)) {
        out.write("<p>");
        {
            Object var_2 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_tiles, "subtitle"), "text");
            out.write(renderContext.getObjectModel().toString(var_2));
        }
        out.write("</p>");
    }
}
out.write("\r\n                    </div> <!-- section title -->\r\n                </div>\r\n            </div> <!-- row -->\r\n            \r\n\r\n\t\t\t<div>");
{
    Object var_resourcecontent3 = renderContext.call("includeResource", "tiles-parsys", obj().with("resourceType", "wcm/foundation/components/responsivegrid"));
    out.write(renderContext.getObjectModel().toString(var_resourcecontent3));
}
out.write("</div>\r\n\r\n        </div> <!-- container -->\r\n    </section>\r\n    \r\n    <!--====== TEAM PART ENDS ======-->");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

