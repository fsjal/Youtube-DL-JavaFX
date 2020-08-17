package com.penta.ytdl.controller;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0004\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001NB\u000f\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\t\u0010D\u001a\u00020EH\u0096\u0001J\t\u0010F\u001a\u00020GH\u0096\u0001J\t\u0010H\u001a\u00020\u0006H\u0096\u0001J\b\u0010I\u001a\u00020JH\u0002J\b\u0010K\u001a\u00020JH\u0002J\b\u0010L\u001a\u00020JH\u0002J\b\u0010M\u001a\u00020JH\u0002R\u0014\u0010\b\u001a\u00020\t8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\rX\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0010\u001a\u0004\u0018\u00010\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R/\u0010\u0017\u001a\u0004\u0018\u00010\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\t8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u0018\u0010\u000b\"\u0004\b\u0019\u0010\u001aR\u001d\u0010\u001c\u001a\u0004\u0018\u00010\u001d8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b \u0010\u0015\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020\t8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\"\u0010\u000bR/\u0010$\u001a\u0004\u0018\u00010#2\b\u0010\u0016\u001a\u0004\u0018\u00010#8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b)\u0010\u0015\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(RG\u0010,\u001a\u0010\u0012\f\u0012\n +*\u0004\u0018\u00010\u00110\u00110*2\u0014\u0010\u0016\u001a\u0010\u0012\f\u0012\n +*\u0004\u0018\u00010\u00110\u00110*8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u000e\u00103\u001a\u00020#X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u00104\u001a\u0004\u0018\u00010#8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b5\u0010\u0015\u001a\u0004\b4\u0010&R+\u00106\u001a\u00020#2\u0006\u0010\u0016\u001a\u00020#8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u000e\u0010<\u001a\u00020=X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010>\u001a\u0004\u0018\u00010\u001d8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b@\u0010\u0015\u001a\u0004\b?\u0010\u001fR\u001d\u0010A\u001a\u0004\u0018\u00010\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\bC\u0010\u0015\u001a\u0004\bB\u0010\u000bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006O"}, d2 = {"Lcom/penta/ytdl/controller/MainController;", "Lcom/penta/ytdl/view/MainView;", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/penta/ytdl/component/MainViewModelComponent;", "Lcom/penta/ytdl/component/LoggerComponent;", "viewModel", "Lcom/penta/ytdl/viewmodel/MainViewModel;", "(Lcom/penta/ytdl/viewmodel/MainViewModel;)V", "commandStr", "", "getCommandStr", "()Ljava/lang/String;", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "currentFormat", "Lcom/penta/ytdl/domain/Format;", "getCurrentFormat", "()Lcom/penta/ytdl/domain/Format;", "currentFormat$delegate", "Lcom/penta/ytdl/util/databinding/DataBinding;", "<set-?>", "downloadText", "getDownloadText", "setDownloadText", "(Ljava/lang/String;)V", "downloadText$delegate", "end", "", "getEnd", "()Ljava/lang/Number;", "end$delegate", "formatStr", "getFormatStr", "", "formatVisible", "getFormatVisible", "()Ljava/lang/Boolean;", "setFormatVisible", "(Ljava/lang/Boolean;)V", "formatVisible$delegate", "", "kotlin.jvm.PlatformType", "formatsList", "getFormatsList", "()Ljava/util/List;", "setFormatsList", "(Ljava/util/List;)V", "formatsList$delegate", "Lcom/penta/ytdl/util/databinding/JComboBoxDataBinding;", "isDownloadAdded", "isExtractAudio", "isExtractAudio$delegate", "isWorking", "()Z", "setWorking", "(Z)V", "isWorking$delegate", "Lkotlin/properties/ReadWriteProperty;", "model", "Ljavax/swing/table/DefaultTableModel;", "start", "getStart", "start$delegate", "url", "getUrl", "url$delegate", "getCommandComponentFactory", "Lcom/penta/ytdl/component/CommandComponent$Factory;", "getLogger", "Lcom/penta/ytdl/util/Logger;", "getMainViewModel", "initObservers", "", "initTable", "initWidgets", "onDownload", "ProgressRenderer", "Youtube-DL"})
@javax.inject.Singleton()
public final class MainController extends com.penta.ytdl.view.MainView implements kotlinx.coroutines.CoroutineScope, com.penta.ytdl.component.MainViewModelComponent, com.penta.ytdl.component.LoggerComponent {
    private final com.penta.ytdl.util.databinding.DataBinding url$delegate = null;
    private final com.penta.ytdl.util.databinding.DataBinding isExtractAudio$delegate = null;
    private final com.penta.ytdl.util.databinding.DataBinding start$delegate = null;
    private final com.penta.ytdl.util.databinding.DataBinding end$delegate = null;
    private final com.penta.ytdl.util.databinding.DataBinding currentFormat$delegate = null;
    private final com.penta.ytdl.util.databinding.JComboBoxDataBinding formatsList$delegate = null;
    private final com.penta.ytdl.util.databinding.DataBinding formatVisible$delegate = null;
    private final com.penta.ytdl.util.databinding.DataBinding downloadText$delegate = null;
    private boolean isDownloadAdded = true;
    private final kotlin.properties.ReadWriteProperty isWorking$delegate = null;
    private final javax.swing.table.DefaultTableModel model = null;
    private final com.penta.ytdl.viewmodel.MainViewModel viewModel = null;
    
    private final java.lang.String getUrl() {
        return null;
    }
    
    private final java.lang.Boolean isExtractAudio() {
        return null;
    }
    
    private final java.lang.Number getStart() {
        return null;
    }
    
    private final java.lang.Number getEnd() {
        return null;
    }
    
    private final com.penta.ytdl.domain.Format getCurrentFormat() {
        return null;
    }
    
    private final java.util.List<com.penta.ytdl.domain.Format> getFormatsList() {
        return null;
    }
    
    private final void setFormatsList(java.util.List<com.penta.ytdl.domain.Format> p0) {
    }
    
    private final java.lang.Boolean getFormatVisible() {
        return null;
    }
    
    private final void setFormatVisible(java.lang.Boolean p0) {
    }
    
    private final java.lang.String getDownloadText() {
        return null;
    }
    
    private final void setDownloadText(java.lang.String p0) {
    }
    
    private final boolean isWorking() {
        return false;
    }
    
    private final void setWorking(boolean p0) {
    }
    
    private final java.lang.String getCommandStr() {
        return null;
    }
    
    private final java.lang.String getFormatStr() {
        return null;
    }
    
    private final void initWidgets() {
    }
    
    private final void initTable() {
    }
    
    private final void initObservers() {
    }
    
    private final void onDownload() {
    }
    
    @javax.inject.Inject()
    public MainController(@org.jetbrains.annotations.NotNull()
    com.penta.ytdl.viewmodel.MainViewModel viewModel) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlin.coroutines.CoroutineContext getCoroutineContext() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J<\u0010\u0004\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016\u00a8\u0006\u000f"}, d2 = {"Lcom/penta/ytdl/controller/MainController$ProgressRenderer;", "Ljavax/swing/JProgressBar;", "Ljavax/swing/table/TableCellRenderer;", "()V", "getTableCellRendererComponent", "table", "Ljavax/swing/JTable;", "value", "", "isSelected", "", "hasFocus", "row", "", "column", "Youtube-DL"})
    static final class ProgressRenderer extends javax.swing.JProgressBar implements javax.swing.table.TableCellRenderer {
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.penta.ytdl.controller.MainController.ProgressRenderer getTableCellRendererComponent(@org.jetbrains.annotations.Nullable()
        javax.swing.JTable table, @org.jetbrains.annotations.Nullable()
        java.lang.Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            return null;
        }
        
        public ProgressRenderer() {
            super();
        }
    }
}