//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.5-b16-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2005.10.30 at 04:44:43 PM BRST 
//


package javabramining.core.parser.generated.impl;

public class JBraminingDefinitionImpl implements javabramining.core.parser.generated.JBraminingDefinition, com.sun.xml.bind.JAXBObject, javabramining.core.parser.generated.impl.runtime.UnmarshallableObject, javabramining.core.parser.generated.impl.runtime.XMLSerializable, javabramining.core.parser.generated.impl.runtime.ValidatableObject
{

    protected javabramining.core.parser.generated.PreProcessingDefinition _Preprocessing;
    protected javabramining.core.parser.generated.PosProcessingDefinition _Posprocessing;
    protected javabramining.core.parser.generated.ConfigurationDefinition _Configuration;
    protected javabramining.core.parser.generated.MiningDefinition _Mining;
    public final static java.lang.Class version = (javabramining.core.parser.generated.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (javabramining.core.parser.generated.JBraminingDefinition.class);
    }

    public javabramining.core.parser.generated.PreProcessingDefinition getPreprocessing() {
        return _Preprocessing;
    }

    public void setPreprocessing(javabramining.core.parser.generated.PreProcessingDefinition value) {
        _Preprocessing = value;
    }

    public javabramining.core.parser.generated.PosProcessingDefinition getPosprocessing() {
        return _Posprocessing;
    }

    public void setPosprocessing(javabramining.core.parser.generated.PosProcessingDefinition value) {
        _Posprocessing = value;
    }

    public javabramining.core.parser.generated.ConfigurationDefinition getConfiguration() {
        return _Configuration;
    }

    public void setConfiguration(javabramining.core.parser.generated.ConfigurationDefinition value) {
        _Configuration = value;
    }

    public javabramining.core.parser.generated.MiningDefinition getMining() {
        return _Mining;
    }

    public void setMining(javabramining.core.parser.generated.MiningDefinition value) {
        _Mining = value;
    }

    public javabramining.core.parser.generated.impl.runtime.UnmarshallingEventHandler createUnmarshaller(javabramining.core.parser.generated.impl.runtime.UnmarshallingContext context) {
        return new javabramining.core.parser.generated.impl.JBraminingDefinitionImpl.Unmarshaller(context);
    }

    public void serializeBody(javabramining.core.parser.generated.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startElement("", "configuration");
        context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Configuration), "Configuration");
        context.endNamespaceDecls();
        context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Configuration), "Configuration");
        context.endAttributes();
        context.childAsBody(((com.sun.xml.bind.JAXBObject) _Configuration), "Configuration");
        context.endElement();
        context.startElement("", "preprocessing");
        context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Preprocessing), "Preprocessing");
        context.endNamespaceDecls();
        context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Preprocessing), "Preprocessing");
        context.endAttributes();
        context.childAsBody(((com.sun.xml.bind.JAXBObject) _Preprocessing), "Preprocessing");
        context.endElement();
        context.startElement("", "mining");
        context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Mining), "Mining");
        context.endNamespaceDecls();
        context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Mining), "Mining");
        context.endAttributes();
        context.childAsBody(((com.sun.xml.bind.JAXBObject) _Mining), "Mining");
        context.endElement();
        context.startElement("", "posprocessing");
        context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Posprocessing), "Posprocessing");
        context.endNamespaceDecls();
        context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Posprocessing), "Posprocessing");
        context.endAttributes();
        context.childAsBody(((com.sun.xml.bind.JAXBObject) _Posprocessing), "Posprocessing");
        context.endElement();
    }

    public void serializeAttributes(javabramining.core.parser.generated.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public void serializeURIs(javabramining.core.parser.generated.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public java.lang.Class getPrimaryInterface() {
        return (javabramining.core.parser.generated.JBraminingDefinition.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.su"
+"n.msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/gra"
+"mmar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expressi"
+"on\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0002L\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000b"
+"expandedExpq\u0000~\u0000\u0002xpppsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000ppsr\u0000\'com.sun.msv.grammar."
+"trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\tnameClasst\u0000\u001fLcom/sun/msv/gr"
+"ammar/NameClass;xr\u0000\u001ecom.sun.msv.grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000"
+"\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000\fcontentModelq\u0000~\u0000\u0002xq\u0000~\u0000\u0003pp\u0000s"
+"q\u0000~\u0000\u0000ppsq\u0000~\u0000\bpp\u0000sr\u0000\u001dcom.sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000"
+"xq\u0000~\u0000\u0001ppsr\u0000 com.sun.msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001cc"
+"om.sun.msv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0002xq\u0000~\u0000\u0003sr\u0000\u0011j"
+"ava.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000psr\u0000 com.sun.msv.gramm"
+"ar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0002L\u0000\tnameClassq\u0000~\u0000\txq\u0000~\u0000\u0003"
+"q\u0000~\u0000\u0014psr\u00002com.sun.msv.grammar.Expression$AnyStringExpression"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003sq\u0000~\u0000\u0013\u0001psr\u0000 com.sun.msv.grammar.AnyNameClas"
+"s\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr"
+"\u00000com.sun.msv.grammar.Expression$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000"
+"\u0000xq\u0000~\u0000\u0003q\u0000~\u0000\u0019psr\u0000#com.sun.msv.grammar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001"
+"\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljava/lang/String;L\u0000\fnamespaceURIq\u0000~\u0000 xq\u0000~"
+"\u0000\u001bt\u0000;javabramining.core.parser.generated.ConfigurationDefini"
+"tiont\u0000+http://java.sun.com/jaxb/xjc/dummy-elementssq\u0000~\u0000\u000eppsq"
+"\u0000~\u0000\u0015q\u0000~\u0000\u0014psr\u0000\u001bcom.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001f"
+"Lorg/relaxng/datatype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0002L\u0000\u0004namet\u0000\u001dLcom/"
+"sun/msv/util/StringPair;xq\u0000~\u0000\u0003ppsr\u0000\"com.sun.msv.datatype.xsd"
+".QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000*com.sun.msv.datatype.xsd.BuiltinAto"
+"micType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.datatype.xsd.ConcreteType\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.datatype.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0001\u0002\u0000\u0003L\u0000\fnamespaceUriq\u0000~\u0000 L\u0000\btypeNameq\u0000~\u0000 L\u0000\nwhiteSpacet\u0000.Lcom"
+"/sun/msv/datatype/xsd/WhiteSpaceProcessor;xpt\u0000 http://www.w3"
+".org/2001/XMLSchemat\u0000\u0005QNamesr\u00005com.sun.msv.datatype.xsd.Whit"
+"eSpaceProcessor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.datatype."
+"xsd.WhiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar."
+"Expression$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003ppsr\u0000\u001bcom.sun.m"
+"sv.util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000 L\u0000\fnamespaceUR"
+"Iq\u0000~\u0000 xpq\u0000~\u00001q\u0000~\u00000sq\u0000~\u0000\u001ft\u0000\u0004typet\u0000)http://www.w3.org/2001/XML"
+"Schema-instanceq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000\rconfigurationt\u0000\u0000sq\u0000~\u0000\bpp\u0000sq\u0000~\u0000\u0000"
+"ppsq\u0000~\u0000\bpp\u0000sq\u0000~\u0000\u000eppsq\u0000~\u0000\u0010q\u0000~\u0000\u0014psq\u0000~\u0000\u0015q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq"
+"\u0000~\u0000\u001ft\u0000;javabramining.core.parser.generated.PreProcessingDefi"
+"nitionq\u0000~\u0000#sq\u0000~\u0000\u000eppsq\u0000~\u0000\u0015q\u0000~\u0000\u0014pq\u0000~\u0000)q\u0000~\u00009q\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000\rprepr"
+"ocessingq\u0000~\u0000>sq\u0000~\u0000\bpp\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\bpp\u0000sq\u0000~\u0000\u000eppsq\u0000~\u0000\u0010q\u0000~\u0000\u0014ps"
+"q\u0000~\u0000\u0015q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u00004javabramining.core.parser"
+".generated.MiningDefinitionq\u0000~\u0000#sq\u0000~\u0000\u000eppsq\u0000~\u0000\u0015q\u0000~\u0000\u0014pq\u0000~\u0000)q\u0000~"
+"\u00009q\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000\u0006miningq\u0000~\u0000>sq\u0000~\u0000\bpp\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\bpp\u0000sq\u0000~\u0000\u000ep"
+"psq\u0000~\u0000\u0010q\u0000~\u0000\u0014psq\u0000~\u0000\u0015q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000;javabramini"
+"ng.core.parser.generated.PosProcessingDefinitionq\u0000~\u0000#sq\u0000~\u0000\u000ep"
+"psq\u0000~\u0000\u0015q\u0000~\u0000\u0014pq\u0000~\u0000)q\u0000~\u00009q\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000\rposprocessingq\u0000~\u0000>sr\u0000\"c"
+"om.sun.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lc"
+"om/sun/msv/grammar/ExpressionPool$ClosedHash;xpsr\u0000-com.sun.m"
+"sv.grammar.ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005countB\u0000\rst"
+"reamVersionL\u0000\u0006parentt\u0000$Lcom/sun/msv/grammar/ExpressionPool;x"
+"p\u0000\u0000\u0000\u0013\u0001pq\u0000~\u0000\u0007q\u0000~\u0000$q\u0000~\u0000Gq\u0000~\u0000Sq\u0000~\u0000_q\u0000~\u0000\u0005q\u0000~\u0000\u0006q\u0000~\u0000\fq\u0000~\u0000@q\u0000~\u0000Lq\u0000~"
+"\u0000Xq\u0000~\u0000\u0012q\u0000~\u0000Cq\u0000~\u0000Oq\u0000~\u0000[q\u0000~\u0000\u000fq\u0000~\u0000Bq\u0000~\u0000Nq\u0000~\u0000Zx"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends javabramining.core.parser.generated.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(javabramining.core.parser.generated.impl.runtime.UnmarshallingContext context) {
            super(context, "-------------");
        }

        protected Unmarshaller(javabramining.core.parser.generated.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return javabramining.core.parser.generated.impl.JBraminingDefinitionImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  1 :
                        if (("databaseHandler" == ___local)&&("" == ___uri)) {
                            _Configuration = ((javabramining.core.parser.generated.impl.ConfigurationDefinitionImpl) spawnChildFromEnterElement((javabramining.core.parser.generated.impl.ConfigurationDefinitionImpl.class), 2, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        break;
                    case  7 :
                        if (("operation" == ___local)&&("" == ___uri)) {
                            _Mining = ((javabramining.core.parser.generated.impl.MiningDefinitionImpl) spawnChildFromEnterElement((javabramining.core.parser.generated.impl.MiningDefinitionImpl.class), 8, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        _Mining = ((javabramining.core.parser.generated.impl.MiningDefinitionImpl) spawnChildFromEnterElement((javabramining.core.parser.generated.impl.MiningDefinitionImpl.class), 8, ___uri, ___local, ___qname, __atts));
                        return ;
                    case  3 :
                        if (("preprocessing" == ___local)&&("" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 4;
                            return ;
                        }
                        break;
                    case  9 :
                        if (("posprocessing" == ___local)&&("" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 10;
                            return ;
                        }
                        break;
                    case  12 :
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  0 :
                        if (("configuration" == ___local)&&("" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 1;
                            return ;
                        }
                        break;
                    case  6 :
                        if (("mining" == ___local)&&("" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 7;
                            return ;
                        }
                        break;
                    case  10 :
                        if (("operation" == ___local)&&("" == ___uri)) {
                            _Posprocessing = ((javabramining.core.parser.generated.impl.PosProcessingDefinitionImpl) spawnChildFromEnterElement((javabramining.core.parser.generated.impl.PosProcessingDefinitionImpl.class), 11, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        _Posprocessing = ((javabramining.core.parser.generated.impl.PosProcessingDefinitionImpl) spawnChildFromEnterElement((javabramining.core.parser.generated.impl.PosProcessingDefinitionImpl.class), 11, ___uri, ___local, ___qname, __atts));
                        return ;
                    case  4 :
                        if (("operation" == ___local)&&("" == ___uri)) {
                            _Preprocessing = ((javabramining.core.parser.generated.impl.PreProcessingDefinitionImpl) spawnChildFromEnterElement((javabramining.core.parser.generated.impl.PreProcessingDefinitionImpl.class), 5, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        _Preprocessing = ((javabramining.core.parser.generated.impl.PreProcessingDefinitionImpl) spawnChildFromEnterElement((javabramining.core.parser.generated.impl.PreProcessingDefinitionImpl.class), 5, ___uri, ___local, ___qname, __atts));
                        return ;
                }
                super.enterElement(___uri, ___local, ___qname, __atts);
                break;
            }
        }

        public void leaveElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  8 :
                        if (("mining" == ___local)&&("" == ___uri)) {
                            context.popAttributes();
                            state = 9;
                            return ;
                        }
                        break;
                    case  2 :
                        if (("configuration" == ___local)&&("" == ___uri)) {
                            context.popAttributes();
                            state = 3;
                            return ;
                        }
                        break;
                    case  5 :
                        if (("preprocessing" == ___local)&&("" == ___uri)) {
                            context.popAttributes();
                            state = 6;
                            return ;
                        }
                        break;
                    case  7 :
                        _Mining = ((javabramining.core.parser.generated.impl.MiningDefinitionImpl) spawnChildFromLeaveElement((javabramining.core.parser.generated.impl.MiningDefinitionImpl.class), 8, ___uri, ___local, ___qname));
                        return ;
                    case  12 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  10 :
                        _Posprocessing = ((javabramining.core.parser.generated.impl.PosProcessingDefinitionImpl) spawnChildFromLeaveElement((javabramining.core.parser.generated.impl.PosProcessingDefinitionImpl.class), 11, ___uri, ___local, ___qname));
                        return ;
                    case  11 :
                        if (("posprocessing" == ___local)&&("" == ___uri)) {
                            context.popAttributes();
                            state = 12;
                            return ;
                        }
                        break;
                    case  4 :
                        _Preprocessing = ((javabramining.core.parser.generated.impl.PreProcessingDefinitionImpl) spawnChildFromLeaveElement((javabramining.core.parser.generated.impl.PreProcessingDefinitionImpl.class), 5, ___uri, ___local, ___qname));
                        return ;
                }
                super.leaveElement(___uri, ___local, ___qname);
                break;
            }
        }

        public void enterAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  7 :
                        _Mining = ((javabramining.core.parser.generated.impl.MiningDefinitionImpl) spawnChildFromEnterAttribute((javabramining.core.parser.generated.impl.MiningDefinitionImpl.class), 8, ___uri, ___local, ___qname));
                        return ;
                    case  12 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                    case  10 :
                        _Posprocessing = ((javabramining.core.parser.generated.impl.PosProcessingDefinitionImpl) spawnChildFromEnterAttribute((javabramining.core.parser.generated.impl.PosProcessingDefinitionImpl.class), 11, ___uri, ___local, ___qname));
                        return ;
                    case  4 :
                        _Preprocessing = ((javabramining.core.parser.generated.impl.PreProcessingDefinitionImpl) spawnChildFromEnterAttribute((javabramining.core.parser.generated.impl.PreProcessingDefinitionImpl.class), 5, ___uri, ___local, ___qname));
                        return ;
                }
                super.enterAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void leaveAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  7 :
                        _Mining = ((javabramining.core.parser.generated.impl.MiningDefinitionImpl) spawnChildFromLeaveAttribute((javabramining.core.parser.generated.impl.MiningDefinitionImpl.class), 8, ___uri, ___local, ___qname));
                        return ;
                    case  12 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                    case  10 :
                        _Posprocessing = ((javabramining.core.parser.generated.impl.PosProcessingDefinitionImpl) spawnChildFromLeaveAttribute((javabramining.core.parser.generated.impl.PosProcessingDefinitionImpl.class), 11, ___uri, ___local, ___qname));
                        return ;
                    case  4 :
                        _Preprocessing = ((javabramining.core.parser.generated.impl.PreProcessingDefinitionImpl) spawnChildFromLeaveAttribute((javabramining.core.parser.generated.impl.PreProcessingDefinitionImpl.class), 5, ___uri, ___local, ___qname));
                        return ;
                }
                super.leaveAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void handleText(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                try {
                    switch (state) {
                        case  7 :
                            _Mining = ((javabramining.core.parser.generated.impl.MiningDefinitionImpl) spawnChildFromText((javabramining.core.parser.generated.impl.MiningDefinitionImpl.class), 8, value));
                            return ;
                        case  12 :
                            revertToParentFromText(value);
                            return ;
                        case  10 :
                            _Posprocessing = ((javabramining.core.parser.generated.impl.PosProcessingDefinitionImpl) spawnChildFromText((javabramining.core.parser.generated.impl.PosProcessingDefinitionImpl.class), 11, value));
                            return ;
                        case  4 :
                            _Preprocessing = ((javabramining.core.parser.generated.impl.PreProcessingDefinitionImpl) spawnChildFromText((javabramining.core.parser.generated.impl.PreProcessingDefinitionImpl.class), 5, value));
                            return ;
                    }
                } catch (java.lang.RuntimeException e) {
                    handleUnexpectedTextException(value, e);
                }
                break;
            }
        }

    }

}
