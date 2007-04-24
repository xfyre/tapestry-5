// Copyright 2006, 2007 The Apache Software Foundation
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package org.apache.tapestry.internal.services;

import org.apache.tapestry.Asset;
import org.apache.tapestry.dom.Document;
import org.apache.tapestry.dom.Element;
import org.apache.tapestry.services.Environment;
import org.apache.tapestry.services.PageRenderCommand;

/**
 * Checks to see if the output document has a &lt;html&gt;/&lt;head&gt; element and, if so, adds the
 * default Tapestry stylesheet to the start.
 */
public class InjectStandardStylesheetCommand implements PageRenderCommand
{
    private final Asset _stylesheetAsset;

    public InjectStandardStylesheetCommand(Asset stylesheetAsset)
    {
        _stylesheetAsset = stylesheetAsset;
    }

    public void setup(Environment environment)
    {
    }

    public void cleanup(Environment environment)
    {
        Document document = environment.peek(Document.class);

        Element head = document.find("html/head");

        if (head == null) return;

        head.elementAt(0, "link", "rel", "stylesheet", "type", "text/css", "href", _stylesheetAsset
                .toClientURL());
    }
}
