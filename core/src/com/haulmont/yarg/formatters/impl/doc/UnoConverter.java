/*
 * Copyright 2013 Haulmont
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.haulmont.yarg.formatters.impl.doc;

import com.sun.star.beans.XPropertySet;
import com.sun.star.container.XEnumerationAccess;
import com.sun.star.container.XNameContainer;
import com.sun.star.datatransfer.XTransferableSupplier;
import com.sun.star.datatransfer.clipboard.XClipboard;
import com.sun.star.document.XDocumentInsertable;
import com.sun.star.drawing.XShape;
import com.sun.star.embed.XStorage;
import com.sun.star.frame.*;
import com.sun.star.graphic.XGraphicProvider;
import com.sun.star.io.XActiveDataSource;
import com.sun.star.io.XInputStream;
import com.sun.star.io.XOutputStream;
import com.sun.star.io.XTextOutputStream;
import com.sun.star.lang.XMultiComponentFactory;
import com.sun.star.lang.XMultiServiceFactory;
import com.sun.star.lang.XServiceInfo;
import com.sun.star.lang.XSingleServiceFactory;
import com.sun.star.table.XCellRange;
import com.sun.star.text.*;
import com.sun.star.uno.Any;
import com.sun.star.uno.Type;
import com.sun.star.uno.UnoRuntime;
import com.sun.star.util.XCloseable;
import com.sun.star.util.XReplaceable;
import com.sun.star.view.XSelectionSupplier;

public final class UnoConverter {

    public static XDesktop asXDesktop(Object o) {
        return (XDesktop) UnoRuntime.queryInterface(XDesktop.class, o);
    }

    public static XComponentLoader asXComponentLoader(Object o) {
        return (XComponentLoader) UnoRuntime.queryInterface(XComponentLoader.class, o);
    }

    public static XStorable asXStorable(Object o) {
        return (XStorable) UnoRuntime.queryInterface(XStorable.class, o);
    }

    public static XCloseable asXCloseable(Object o) {
        return (XCloseable) UnoRuntime.queryInterface(XCloseable.class, o);
    }

    public static XPropertySet asXPropertySet(Object o) {
        return (XPropertySet) UnoRuntime.queryInterface(XPropertySet.class, o);
    }

    public static XNameContainer asXNameContainer(Object o) {
        return (XNameContainer) UnoRuntime.queryInterface(XNameContainer.class, o);
    }

    public static XShape asXShape(Object o) {
        return (XShape) UnoRuntime.queryInterface(XShape.class, o);
    }

    public static XMultiServiceFactory asXMultiServiceFactory(Object o) {
        return (XMultiServiceFactory) UnoRuntime.queryInterface(XMultiServiceFactory.class, o);
    }

    public static XStorage asXStorage(Object o) {
        return (XStorage) UnoRuntime.queryInterface(XStorage.class, o);
    }

    public static XModel asXModel(Object o) {
        return (XModel) UnoRuntime.queryInterface(XModel.class, o);
    }

    public static XInputStream asXInputStream(Object o) {
        return (XInputStream) UnoRuntime.queryInterface(XInputStream.class, o);
    }

    public static XClipboard asXClipboard(Object o) {
        return (XClipboard) UnoRuntime.queryInterface(XClipboard.class, o);
    }

    public static XDocumentInsertable asXDocumentInsertable(Object o) {
        return (XDocumentInsertable) UnoRuntime.queryInterface(XDocumentInsertable.class, o);
    }

    public static XOutputStream asXOutputStream(Object o) {
        return (XOutputStream) UnoRuntime.queryInterface(XOutputStream.class, o);
    }

    public static XTextOutputStream asXTextOutputStream(Object o) {
        return (XTextOutputStream) UnoRuntime.queryInterface(XTextOutputStream.class, o);
    }

    public static XMultiComponentFactory asXMultiComponentFactory(Object o) {
        return (XMultiComponentFactory) UnoRuntime.queryInterface(XMultiComponentFactory.class, o);
    }

    public static XSingleServiceFactory asXSingleServiceFactory(Object o) {
        return (XSingleServiceFactory) UnoRuntime.queryInterface(XSingleServiceFactory.class, o);
    }

    public static XTextViewCursorSupplier asXTextViewCursorSupplier(Object o) {
        return (XTextViewCursorSupplier) UnoRuntime.queryInterface(XTextViewCursorSupplier.class, o);
    }

    public static XTransferableSupplier asXTransferableSupplier(Object o) {
        return (XTransferableSupplier) UnoRuntime.queryInterface(XTransferableSupplier.class, o);
    }

    public static XActiveDataSource asXActiveDataSource(Object o) {
        return (XActiveDataSource) UnoRuntime.queryInterface(XActiveDataSource.class, o);
    }

    public static XTextDocument asXTextDocument(Object o) {
        return (XTextDocument) UnoRuntime.queryInterface(XTextDocument.class, o);
    }

    public static XTextContent asXTextContent(Object o) {
        return (XTextContent) UnoRuntime.queryInterface(XTextContent.class, o);
    }

    public static XText asXText(Object o) {
        return (XText) UnoRuntime.queryInterface(XText.class, o);
    }

    public static XTextRange asXTextRange(Object o) {
        return (XTextRange) UnoRuntime.queryInterface(XTextRange.class, o);
    }

    public static XEnumerationAccess asXEnumerationAccess(Object o) {
        return (XEnumerationAccess) UnoRuntime.queryInterface(XEnumerationAccess.class, o);
    }

    public static XServiceInfo asXServiceInfo(Object o) {
        return (XServiceInfo) UnoRuntime.queryInterface(XServiceInfo.class, o);
    }

    public static XTextTablesSupplier asXTextTablesSupplier(Object o) {
        return (XTextTablesSupplier) UnoRuntime.queryInterface(XTextTablesSupplier.class, o);
    }

    public static XCellRange asXCellRange(Object o) {
        return (XCellRange) UnoRuntime.queryInterface(XCellRange.class, o);
    }

    public static XDispatchProvider asXDispatchProvider(Object o) {
        return (XDispatchProvider) UnoRuntime.queryInterface(XDispatchProvider.class, o);
    }

    public static XTextViewCursorSupplier asXTextCursorSupplier(Object o) {
        return (XTextViewCursorSupplier) UnoRuntime.queryInterface(XTextViewCursorSupplier.class, o);
    }

    public static XDispatchHelper asXDispatchHelper(Object o) {
        return (XDispatchHelper) UnoRuntime.queryInterface(XDispatchHelper.class, o);
    }

    public static XSelectionSupplier asXSelectionSupplier(Object o) {
        return (XSelectionSupplier) UnoRuntime.queryInterface(XSelectionSupplier.class, o);
    }

    public static XReplaceable asXReplaceable(Object o) {
        return (XReplaceable) UnoRuntime.queryInterface(XReplaceable.class, o);
    }

    public static XGraphicProvider asXGraphicProvider(Object o) {
        return (XGraphicProvider) UnoRuntime.queryInterface(XGraphicProvider.class, o);
    }

    public static Any createAny(Object o) {
        return new Any(new Type(o.getClass()), o);
    }
}
