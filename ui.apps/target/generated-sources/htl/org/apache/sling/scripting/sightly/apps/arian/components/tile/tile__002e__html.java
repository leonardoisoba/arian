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
package org.apache.sling.scripting.sightly.apps.arian.components.tile;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class tile__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_tile = null;
Collection var_collectionvar6_list_coerced$ = null;
out.write("\t\t\t\t\r\n                    ");
_global_tile = renderContext.call("use", com.arian.core.models.TileModel.class.getName(), obj());
out.write("<div class=\"tile-m-30 single-temp text-center mt-30\">\r\n                        <div class=\"team-image\">\r\n                            <img");
{
    Object var_attrvalue0 = renderContext.getObjectModel().resolveProperty(_global_tile, "titleImage");
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
out.write(" alt=\"Team\"/>\r\n                        </div>\r\n                        <div class=\"team-content mt-30\">\r\n                            <h4 class=\"title mb-10\">");
{
    Object var_4 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_tile, "name"), "text");
    out.write(renderContext.getObjectModel().toString(var_4));
}
out.write("</h4>\r\n                            <span>");
{
    Object var_5 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_tile, "rol"), "text");
    out.write(renderContext.getObjectModel().toString(var_5));
}
out.write("</span>\r\n                            <ul class=\"social mt-15\">\r\n                              ");
{
    Object var_collectionvar6 = renderContext.getObjectModel().resolveProperty(_global_tile, "socialsNetworks");
    {
        long var_size7 = ((var_collectionvar6_list_coerced$ == null ? (var_collectionvar6_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar6)) : var_collectionvar6_list_coerced$).size());
        {
            boolean var_notempty8 = (var_size7 > 0);
            if (var_notempty8) {
                {
                    long var_end11 = var_size7;
                    {
                        boolean var_validstartstepend12 = (((0 < var_size7) && true) && (var_end11 > 0));
                        if (var_validstartstepend12) {
                            if (var_collectionvar6_list_coerced$ == null) {
                                var_collectionvar6_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar6);
                            }
                            long var_index13 = 0;
                            for (Object socialnetwork : var_collectionvar6_list_coerced$) {
                                {
                                    boolean var_traversal15 = (((var_index13 >= 0) && (var_index13 <= var_end11)) && true);
                                    if (var_traversal15) {
                                        out.write("\r\n                            \t<li");
                                        {
                                            Object var_attrvalue16 = renderContext.getObjectModel().resolveProperty(socialnetwork, "socialId");
                                            {
                                                Object var_attrcontent17 = renderContext.call("xss", var_attrvalue16, "attribute");
                                                {
                                                    boolean var_shoulddisplayattr19 = (((null != var_attrcontent17) && (!"".equals(var_attrcontent17))) && ((!"".equals(var_attrvalue16)) && (!((Object)false).equals(var_attrvalue16))));
                                                    if (var_shoulddisplayattr19) {
                                                        out.write(" id");
                                                        {
                                                            boolean var_istrueattr18 = (var_attrvalue16.equals(true));
                                                            if (!var_istrueattr18) {
                                                                out.write("=\"");
                                                                out.write(renderContext.getObjectModel().toString(var_attrcontent17));
                                                                out.write("\"");
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        out.write(">\r\n                            \t\t<a");
                                        {
                                            Object var_attrvalue20 = renderContext.getObjectModel().resolveProperty(socialnetwork, "socialLink");
                                            {
                                                Object var_attrcontent21 = renderContext.call("xss", var_attrvalue20, "uri");
                                                {
                                                    boolean var_shoulddisplayattr23 = (((null != var_attrcontent21) && (!"".equals(var_attrcontent21))) && ((!"".equals(var_attrvalue20)) && (!((Object)false).equals(var_attrvalue20))));
                                                    if (var_shoulddisplayattr23) {
                                                        out.write(" href");
                                                        {
                                                            boolean var_istrueattr22 = (var_attrvalue20.equals(true));
                                                            if (!var_istrueattr22) {
                                                                out.write("=\"");
                                                                out.write(renderContext.getObjectModel().toString(var_attrcontent21));
                                                                out.write("\"");
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        out.write(" target=\"_blank\">");
                                        {
                                            String var_24 = (renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(socialnetwork, "socialName"), "text")) + " \r\n                            \t\t\t");
                                            out.write(renderContext.getObjectModel().toString(var_24));
                                        }
                                        out.write("<img");
                                        {
                                            Object var_attrvalue25 = renderContext.getObjectModel().resolveProperty(socialnetwork, "socialImage");
                                            {
                                                Object var_attrcontent26 = renderContext.call("xss", var_attrvalue25, "uri");
                                                {
                                                    boolean var_shoulddisplayattr28 = (((null != var_attrcontent26) && (!"".equals(var_attrcontent26))) && ((!"".equals(var_attrvalue25)) && (!((Object)false).equals(var_attrvalue25))));
                                                    if (var_shoulddisplayattr28) {
                                                        out.write(" src");
                                                        {
                                                            boolean var_istrueattr27 = (var_attrvalue25.equals(true));
                                                            if (!var_istrueattr27) {
                                                                out.write("=\"");
                                                                out.write(renderContext.getObjectModel().toString(var_attrcontent26));
                                                                out.write("\"");
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        {
                                            String var_attrcontent29 = (renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(socialnetwork, "socialName"), "attribute")) + " ");
                                            out.write(" alt=\"");
                                            out.write(renderContext.getObjectModel().toString(var_attrcontent29));
                                            out.write("\"");
                                        }
                                        out.write("/>\r\n                            \t\t</a>\r\n                            \t</li>\r\n                              ");
                                    }
                                }
                                var_index13++;
                            }
                        }
                    }
                }
            }
        }
    }
    var_collectionvar6_list_coerced$ = null;
}
out.write("\r\n                            </ul>\r\n                        </div>\r\n                    </div>");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

