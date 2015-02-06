//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.5-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.10.07 at 09:27:50 PM CEST 
//


package slash.navigation.kml.binding21;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import java.util.List;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the slash.navigation.kml.binding21 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ItemIconTypeState_QNAME = new QName("http://earth.google.com/kml/2.1", "state");
    private final static QName _TimeStamp_QNAME = new QName("http://earth.google.com/kml/2.1", "TimeStamp");
    private final static QName _MultiGeometry_QNAME = new QName("http://earth.google.com/kml/2.1", "MultiGeometry");
    private final static QName _LinearRing_QNAME = new QName("http://earth.google.com/kml/2.1", "LinearRing");
    private final static QName _Placemark_QNAME = new QName("http://earth.google.com/kml/2.1", "Placemark");
    private final static QName _NetworkLink_QNAME = new QName("http://earth.google.com/kml/2.1", "NetworkLink");
    private final static QName _Link_QNAME = new QName("http://earth.google.com/kml/2.1", "Link");
    private final static QName _Model_QNAME = new QName("http://earth.google.com/kml/2.1", "Model");
    private final static QName _Feature_QNAME = new QName("http://earth.google.com/kml/2.1", "Feature");
    private final static QName _TimeSpan_QNAME = new QName("http://earth.google.com/kml/2.1", "TimeSpan");
    private final static QName _Lod_QNAME = new QName("http://earth.google.com/kml/2.1", "Lod");
    private final static QName _Scale_QNAME = new QName("http://earth.google.com/kml/2.1", "Scale");
    private final static QName _Object_QNAME = new QName("http://earth.google.com/kml/2.1", "Object");
    private final static QName _ListStyle_QNAME = new QName("http://earth.google.com/kml/2.1", "ListStyle");
    private final static QName _LineStyle_QNAME = new QName("http://earth.google.com/kml/2.1", "LineStyle");
    private final static QName _LineString_QNAME = new QName("http://earth.google.com/kml/2.1", "LineString");
    private final static QName _Point_QNAME = new QName("http://earth.google.com/kml/2.1", "Point");
    private final static QName _StyleUrl_QNAME = new QName("http://earth.google.com/kml/2.1", "styleUrl");
    private final static QName _Geometry_QNAME = new QName("http://earth.google.com/kml/2.1", "Geometry");
    private final static QName _Coordinates_QNAME = new QName("http://earth.google.com/kml/2.1", "coordinates");
    private final static QName _Polygon_QNAME = new QName("http://earth.google.com/kml/2.1", "Polygon");
    private final static QName _LatLonBox_QNAME = new QName("http://earth.google.com/kml/2.1", "LatLonBox");
    private final static QName _TimePrimitive_QNAME = new QName("http://earth.google.com/kml/2.1", "TimePrimitive");
    private final static QName _Style_QNAME = new QName("http://earth.google.com/kml/2.1", "Style");
    private final static QName _Location_QNAME = new QName("http://earth.google.com/kml/2.1", "Location");
    private final static QName _GroundOverlay_QNAME = new QName("http://earth.google.com/kml/2.1", "GroundOverlay");
    private final static QName _StyleMap_QNAME = new QName("http://earth.google.com/kml/2.1", "StyleMap");
    private final static QName _Document_QNAME = new QName("http://earth.google.com/kml/2.1", "Document");
    private final static QName _PolyStyle_QNAME = new QName("http://earth.google.com/kml/2.1", "PolyStyle");
    private final static QName _Folder_QNAME = new QName("http://earth.google.com/kml/2.1", "Folder");
    private final static QName _Icon_QNAME = new QName("http://earth.google.com/kml/2.1", "Icon");
    private final static QName _Region_QNAME = new QName("http://earth.google.com/kml/2.1", "Region");
    private final static QName _LatLonAltBox_QNAME = new QName("http://earth.google.com/kml/2.1", "LatLonAltBox");
    private final static QName _BalloonStyle_QNAME = new QName("http://earth.google.com/kml/2.1", "BalloonStyle");
    private final static QName _IconStyle_QNAME = new QName("http://earth.google.com/kml/2.1", "IconStyle");
    private final static QName _LookAt_QNAME = new QName("http://earth.google.com/kml/2.1", "LookAt");
    private final static QName _ScreenOverlay_QNAME = new QName("http://earth.google.com/kml/2.1", "ScreenOverlay");
    private final static QName _StyleSelector_QNAME = new QName("http://earth.google.com/kml/2.1", "StyleSelector");
    private final static QName _Orientation_QNAME = new QName("http://earth.google.com/kml/2.1", "Orientation");
    private final static QName _Kml_QNAME = new QName("http://earth.google.com/kml/2.1", "kml");
    private final static QName _LabelStyle_QNAME = new QName("http://earth.google.com/kml/2.1", "LabelStyle");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: slash.navigation.kml.binding21
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link StyleMapPairType }
     * 
     */
    public StyleMapPairType createStyleMapPairType() {
        return new StyleMapPairType();
    }

    /**
     * Create an instance of {@link KmlType }
     * 
     */
    public KmlType createKmlType() {
        return new KmlType();
    }

    /**
     * Create an instance of {@link NetworkLinkControlType }
     * 
     */
    public NetworkLinkControlType createNetworkLinkControlType() {
        return new NetworkLinkControlType();
    }

    /**
     * Create an instance of {@link LatLonAltBoxType }
     * 
     */
    public LatLonAltBoxType createLatLonAltBoxType() {
        return new LatLonAltBoxType();
    }

    /**
     * Create an instance of {@link LocationType }
     * 
     */
    public LocationType createLocationType() {
        return new LocationType();
    }

    /**
     * Create an instance of {@link RegionType }
     * 
     */
    public RegionType createRegionType() {
        return new RegionType();
    }

    /**
     * Create an instance of {@link UpdateType }
     * 
     */
    public UpdateType createUpdateType() {
        return new UpdateType();
    }

    /**
     * Create an instance of {@link PolygonType }
     * 
     */
    public PolygonType createPolygonType() {
        return new PolygonType();
    }

    /**
     * Create an instance of {@link IconType }
     * 
     */
    public IconType createIconType() {
        return new IconType();
    }

    /**
     * Create an instance of {@link LabelStyleType }
     * 
     */
    public LabelStyleType createLabelStyleType() {
        return new LabelStyleType();
    }

    /**
     * Create an instance of {@link PlacemarkType }
     * 
     */
    public PlacemarkType createPlacemarkType() {
        return new PlacemarkType();
    }

    /**
     * Create an instance of {@link LinearRingType }
     * 
     */
    public LinearRingType createLinearRingType() {
        return new LinearRingType();
    }

    /**
     * Create an instance of {@link LatLonBoxType }
     * 
     */
    public LatLonBoxType createLatLonBoxType() {
        return new LatLonBoxType();
    }

    /**
     * Create an instance of {@link ModelType }
     * 
     */
    public ModelType createModelType() {
        return new ModelType();
    }

    /**
     * Create an instance of {@link NetworkLinkType }
     * 
     */
    public NetworkLinkType createNetworkLinkType() {
        return new NetworkLinkType();
    }

    /**
     * Create an instance of {@link TimeStampType }
     * 
     */
    public TimeStampType createTimeStampType() {
        return new TimeStampType();
    }

    /**
     * Create an instance of {@link StyleType }
     * 
     */
    public StyleType createStyleType() {
        return new StyleType();
    }

    /**
     * Create an instance of {@link ScreenOverlayType }
     * 
     */
    public ScreenOverlayType createScreenOverlayType() {
        return new ScreenOverlayType();
    }

    /**
     * Create an instance of {@link LodType }
     * 
     */
    public LodType createLodType() {
        return new LodType();
    }

    /**
     * Create an instance of {@link ItemIconType }
     * 
     */
    public ItemIconType createItemIconType() {
        return new ItemIconType();
    }

    /**
     * Create an instance of {@link ScaleType }
     * 
     */
    public ScaleType createScaleType() {
        return new ScaleType();
    }

    /**
     * Create an instance of {@link SnippetType }
     * 
     */
    public SnippetType createSnippetType() {
        return new SnippetType();
    }

    /**
     * Create an instance of {@link LinkType }
     * 
     */
    public LinkType createLinkType() {
        return new LinkType();
    }

    /**
     * Create an instance of {@link PointType }
     * 
     */
    public PointType createPointType() {
        return new PointType();
    }

    /**
     * Create an instance of {@link LookAtType }
     * 
     */
    public LookAtType createLookAtType() {
        return new LookAtType();
    }

    /**
     * Create an instance of {@link BalloonStyleType }
     * 
     */
    public BalloonStyleType createBalloonStyleType() {
        return new BalloonStyleType();
    }

    /**
     * Create an instance of {@link LineStyleType }
     * 
     */
    public LineStyleType createLineStyleType() {
        return new LineStyleType();
    }

    /**
     * Create an instance of {@link TimeSpanType }
     * 
     */
    public TimeSpanType createTimeSpanType() {
        return new TimeSpanType();
    }

    /**
     * Create an instance of {@link ReplaceType }
     * 
     */
    public ReplaceType createReplaceType() {
        return new ReplaceType();
    }

    /**
     * Create an instance of {@link IconStyleType }
     * 
     */
    public IconStyleType createIconStyleType() {
        return new IconStyleType();
    }

    /**
     * Create an instance of {@link StyleMapType }
     * 
     */
    public StyleMapType createStyleMapType() {
        return new StyleMapType();
    }

    /**
     * Create an instance of {@link OrientationType }
     * 
     */
    public OrientationType createOrientationType() {
        return new OrientationType();
    }

    /**
     * Create an instance of {@link DeleteType }
     * 
     */
    public DeleteType createDeleteType() {
        return new DeleteType();
    }

    /**
     * Create an instance of {@link CreateType }
     * 
     */
    public CreateType createCreateType() {
        return new CreateType();
    }

    /**
     * Create an instance of {@link MetadataType }
     * 
     */
    public MetadataType createMetadataType() {
        return new MetadataType();
    }

    /**
     * Create an instance of {@link ListStyleType }
     * 
     */
    public ListStyleType createListStyleType() {
        return new ListStyleType();
    }

    /**
     * Create an instance of {@link BoundaryType }
     * 
     */
    public BoundaryType createBoundaryType() {
        return new BoundaryType();
    }

    /**
     * Create an instance of {@link FolderType }
     * 
     */
    public FolderType createFolderType() {
        return new FolderType();
    }

    /**
     * Create an instance of {@link MultiGeometryType }
     * 
     */
    public MultiGeometryType createMultiGeometryType() {
        return new MultiGeometryType();
    }

    /**
     * Create an instance of {@link IconStyleIconType }
     * 
     */
    public IconStyleIconType createIconStyleIconType() {
        return new IconStyleIconType();
    }

    /**
     * Create an instance of {@link Vec2Type }
     * 
     */
    public Vec2Type createVec2Type() {
        return new Vec2Type();
    }

    /**
     * Create an instance of {@link DocumentType }
     * 
     */
    public DocumentType createDocumentType() {
        return new DocumentType();
    }

    /**
     * Create an instance of {@link GroundOverlayType }
     * 
     */
    public GroundOverlayType createGroundOverlayType() {
        return new GroundOverlayType();
    }

    /**
     * Create an instance of {@link PolyStyleType }
     * 
     */
    public PolyStyleType createPolyStyleType() {
        return new PolyStyleType();
    }

    /**
     * Create an instance of {@link ChangeType }
     * 
     */
    public ChangeType createChangeType() {
        return new ChangeType();
    }

    /**
     * Create an instance of {@link LineStringType }
     * 
     */
    public LineStringType createLineStringType() {
        return new LineStringType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link ItemIconStateEnum }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://earth.google.com/kml/2.1", name = "state", scope = ItemIconType.class)
    public JAXBElement<List<ItemIconStateEnum>> createItemIconTypeState(List<ItemIconStateEnum> value) {
        return new JAXBElement<>(_ItemIconTypeState_QNAME, ((Class) List.class), ItemIconType.class, ((List<ItemIconStateEnum> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeStampType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://earth.google.com/kml/2.1", name = "TimeStamp", substitutionHeadNamespace = "http://earth.google.com/kml/2.1", substitutionHeadName = "TimePrimitive")
    public JAXBElement<TimeStampType> createTimeStamp(TimeStampType value) {
        return new JAXBElement<>(_TimeStamp_QNAME, TimeStampType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiGeometryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://earth.google.com/kml/2.1", name = "MultiGeometry", substitutionHeadNamespace = "http://earth.google.com/kml/2.1", substitutionHeadName = "Geometry")
    public JAXBElement<MultiGeometryType> createMultiGeometry(MultiGeometryType value) {
        return new JAXBElement<>(_MultiGeometry_QNAME, MultiGeometryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LinearRingType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://earth.google.com/kml/2.1", name = "LinearRing", substitutionHeadNamespace = "http://earth.google.com/kml/2.1", substitutionHeadName = "Geometry")
    public JAXBElement<LinearRingType> createLinearRing(LinearRingType value) {
        return new JAXBElement<>(_LinearRing_QNAME, LinearRingType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlacemarkType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://earth.google.com/kml/2.1", name = "Placemark", substitutionHeadNamespace = "http://earth.google.com/kml/2.1", substitutionHeadName = "Feature")
    public JAXBElement<PlacemarkType> createPlacemark(PlacemarkType value) {
        return new JAXBElement<>(_Placemark_QNAME, PlacemarkType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetworkLinkType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://earth.google.com/kml/2.1", name = "NetworkLink", substitutionHeadNamespace = "http://earth.google.com/kml/2.1", substitutionHeadName = "Feature")
    public JAXBElement<NetworkLinkType> createNetworkLink(NetworkLinkType value) {
        return new JAXBElement<>(_NetworkLink_QNAME, NetworkLinkType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LinkType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://earth.google.com/kml/2.1", name = "Link", substitutionHeadNamespace = "http://earth.google.com/kml/2.1", substitutionHeadName = "Object")
    public JAXBElement<LinkType> createLink(LinkType value) {
        return new JAXBElement<>(_Link_QNAME, LinkType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://earth.google.com/kml/2.1", name = "Model", substitutionHeadNamespace = "http://earth.google.com/kml/2.1", substitutionHeadName = "Geometry")
    public JAXBElement<ModelType> createModel(ModelType value) {
        return new JAXBElement<>(_Model_QNAME, ModelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FeatureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://earth.google.com/kml/2.1", name = "Feature")
    public JAXBElement<FeatureType> createFeature(FeatureType value) {
        return new JAXBElement<>(_Feature_QNAME, FeatureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeSpanType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://earth.google.com/kml/2.1", name = "TimeSpan", substitutionHeadNamespace = "http://earth.google.com/kml/2.1", substitutionHeadName = "TimePrimitive")
    public JAXBElement<TimeSpanType> createTimeSpan(TimeSpanType value) {
        return new JAXBElement<>(_TimeSpan_QNAME, TimeSpanType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://earth.google.com/kml/2.1", name = "Lod", substitutionHeadNamespace = "http://earth.google.com/kml/2.1", substitutionHeadName = "Object")
    public JAXBElement<LodType> createLod(LodType value) {
        return new JAXBElement<>(_Lod_QNAME, LodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScaleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://earth.google.com/kml/2.1", name = "Scale", substitutionHeadNamespace = "http://earth.google.com/kml/2.1", substitutionHeadName = "Object")
    public JAXBElement<ScaleType> createScale(ScaleType value) {
        return new JAXBElement<>(_Scale_QNAME, ScaleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObjectType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://earth.google.com/kml/2.1", name = "Object")
    public JAXBElement<ObjectType> createObject(ObjectType value) {
        return new JAXBElement<>(_Object_QNAME, ObjectType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListStyleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://earth.google.com/kml/2.1", name = "ListStyle", substitutionHeadNamespace = "http://earth.google.com/kml/2.1", substitutionHeadName = "Object")
    public JAXBElement<ListStyleType> createListStyle(ListStyleType value) {
        return new JAXBElement<>(_ListStyle_QNAME, ListStyleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineStyleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://earth.google.com/kml/2.1", name = "LineStyle", substitutionHeadNamespace = "http://earth.google.com/kml/2.1", substitutionHeadName = "Object")
    public JAXBElement<LineStyleType> createLineStyle(LineStyleType value) {
        return new JAXBElement<>(_LineStyle_QNAME, LineStyleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://earth.google.com/kml/2.1", name = "LineString", substitutionHeadNamespace = "http://earth.google.com/kml/2.1", substitutionHeadName = "Geometry")
    public JAXBElement<LineStringType> createLineString(LineStringType value) {
        return new JAXBElement<>(_LineString_QNAME, LineStringType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PointType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://earth.google.com/kml/2.1", name = "Point", substitutionHeadNamespace = "http://earth.google.com/kml/2.1", substitutionHeadName = "Geometry")
    public JAXBElement<PointType> createPoint(PointType value) {
        return new JAXBElement<>(_Point_QNAME, PointType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://earth.google.com/kml/2.1", name = "styleUrl")
    public JAXBElement<String> createStyleUrl(String value) {
        return new JAXBElement<>(_StyleUrl_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeometryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://earth.google.com/kml/2.1", name = "Geometry")
    public JAXBElement<GeometryType> createGeometry(GeometryType value) {
        return new JAXBElement<>(_Geometry_QNAME, GeometryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://earth.google.com/kml/2.1", name = "coordinates")
    public JAXBElement<List<String>> createCoordinates(List<String> value) {
        return new JAXBElement<>(_Coordinates_QNAME, ((Class) List.class), null, ((List<String> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PolygonType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://earth.google.com/kml/2.1", name = "Polygon", substitutionHeadNamespace = "http://earth.google.com/kml/2.1", substitutionHeadName = "Geometry")
    public JAXBElement<PolygonType> createPolygon(PolygonType value) {
        return new JAXBElement<>(_Polygon_QNAME, PolygonType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LatLonBoxType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://earth.google.com/kml/2.1", name = "LatLonBox", substitutionHeadNamespace = "http://earth.google.com/kml/2.1", substitutionHeadName = "Object")
    public JAXBElement<LatLonBoxType> createLatLonBox(LatLonBoxType value) {
        return new JAXBElement<>(_LatLonBox_QNAME, LatLonBoxType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimePrimitiveType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://earth.google.com/kml/2.1", name = "TimePrimitive")
    public JAXBElement<TimePrimitiveType> createTimePrimitive(TimePrimitiveType value) {
        return new JAXBElement<>(_TimePrimitive_QNAME, TimePrimitiveType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StyleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://earth.google.com/kml/2.1", name = "Style", substitutionHeadNamespace = "http://earth.google.com/kml/2.1", substitutionHeadName = "StyleSelector")
    public JAXBElement<StyleType> createStyle(StyleType value) {
        return new JAXBElement<>(_Style_QNAME, StyleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://earth.google.com/kml/2.1", name = "Location", substitutionHeadNamespace = "http://earth.google.com/kml/2.1", substitutionHeadName = "Object")
    public JAXBElement<LocationType> createLocation(LocationType value) {
        return new JAXBElement<>(_Location_QNAME, LocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GroundOverlayType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://earth.google.com/kml/2.1", name = "GroundOverlay", substitutionHeadNamespace = "http://earth.google.com/kml/2.1", substitutionHeadName = "Feature")
    public JAXBElement<GroundOverlayType> createGroundOverlay(GroundOverlayType value) {
        return new JAXBElement<>(_GroundOverlay_QNAME, GroundOverlayType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StyleMapType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://earth.google.com/kml/2.1", name = "StyleMap", substitutionHeadNamespace = "http://earth.google.com/kml/2.1", substitutionHeadName = "StyleSelector")
    public JAXBElement<StyleMapType> createStyleMap(StyleMapType value) {
        return new JAXBElement<>(_StyleMap_QNAME, StyleMapType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://earth.google.com/kml/2.1", name = "Document", substitutionHeadNamespace = "http://earth.google.com/kml/2.1", substitutionHeadName = "Feature")
    public JAXBElement<DocumentType> createDocument(DocumentType value) {
        return new JAXBElement<>(_Document_QNAME, DocumentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PolyStyleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://earth.google.com/kml/2.1", name = "PolyStyle", substitutionHeadNamespace = "http://earth.google.com/kml/2.1", substitutionHeadName = "Object")
    public JAXBElement<PolyStyleType> createPolyStyle(PolyStyleType value) {
        return new JAXBElement<>(_PolyStyle_QNAME, PolyStyleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FolderType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://earth.google.com/kml/2.1", name = "Folder", substitutionHeadNamespace = "http://earth.google.com/kml/2.1", substitutionHeadName = "Feature")
    public JAXBElement<FolderType> createFolder(FolderType value) {
        return new JAXBElement<>(_Folder_QNAME, FolderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LinkType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://earth.google.com/kml/2.1", name = "Icon", substitutionHeadNamespace = "http://earth.google.com/kml/2.1", substitutionHeadName = "Object")
    public JAXBElement<LinkType> createIcon(LinkType value) {
        return new JAXBElement<>(_Icon_QNAME, LinkType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://earth.google.com/kml/2.1", name = "Region", substitutionHeadNamespace = "http://earth.google.com/kml/2.1", substitutionHeadName = "Object")
    public JAXBElement<RegionType> createRegion(RegionType value) {
        return new JAXBElement<>(_Region_QNAME, RegionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LatLonAltBoxType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://earth.google.com/kml/2.1", name = "LatLonAltBox")
    public JAXBElement<LatLonAltBoxType> createLatLonAltBox(LatLonAltBoxType value) {
        return new JAXBElement<>(_LatLonAltBox_QNAME, LatLonAltBoxType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BalloonStyleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://earth.google.com/kml/2.1", name = "BalloonStyle", substitutionHeadNamespace = "http://earth.google.com/kml/2.1", substitutionHeadName = "Object")
    public JAXBElement<BalloonStyleType> createBalloonStyle(BalloonStyleType value) {
        return new JAXBElement<>(_BalloonStyle_QNAME, BalloonStyleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IconStyleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://earth.google.com/kml/2.1", name = "IconStyle", substitutionHeadNamespace = "http://earth.google.com/kml/2.1", substitutionHeadName = "Object")
    public JAXBElement<IconStyleType> createIconStyle(IconStyleType value) {
        return new JAXBElement<>(_IconStyle_QNAME, IconStyleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LookAtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://earth.google.com/kml/2.1", name = "LookAt", substitutionHeadNamespace = "http://earth.google.com/kml/2.1", substitutionHeadName = "Object")
    public JAXBElement<LookAtType> createLookAt(LookAtType value) {
        return new JAXBElement<>(_LookAt_QNAME, LookAtType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScreenOverlayType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://earth.google.com/kml/2.1", name = "ScreenOverlay", substitutionHeadNamespace = "http://earth.google.com/kml/2.1", substitutionHeadName = "Feature")
    public JAXBElement<ScreenOverlayType> createScreenOverlay(ScreenOverlayType value) {
        return new JAXBElement<>(_ScreenOverlay_QNAME, ScreenOverlayType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StyleSelectorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://earth.google.com/kml/2.1", name = "StyleSelector")
    public JAXBElement<StyleSelectorType> createStyleSelector(StyleSelectorType value) {
        return new JAXBElement<>(_StyleSelector_QNAME, StyleSelectorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrientationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://earth.google.com/kml/2.1", name = "Orientation", substitutionHeadNamespace = "http://earth.google.com/kml/2.1", substitutionHeadName = "Object")
    public JAXBElement<OrientationType> createOrientation(OrientationType value) {
        return new JAXBElement<>(_Orientation_QNAME, OrientationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KmlType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://earth.google.com/kml/2.1", name = "kml")
    public JAXBElement<KmlType> createKml(KmlType value) {
        return new JAXBElement<>(_Kml_QNAME, KmlType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LabelStyleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://earth.google.com/kml/2.1", name = "LabelStyle", substitutionHeadNamespace = "http://earth.google.com/kml/2.1", substitutionHeadName = "Object")
    public JAXBElement<LabelStyleType> createLabelStyle(LabelStyleType value) {
        return new JAXBElement<>(_LabelStyle_QNAME, LabelStyleType.class, null, value);
    }

}
