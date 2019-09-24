<?xml version="1.0" encoding="UTF-8"?>
<SMTK_AttributeResource Version="3">
  <Categories>
    <Cat>Category1</Cat>
    <Cat>Category2</Cat>
  </Categories>
  <Analyses>
    <Analysis Type="Analysis1">
      <Cat>Category2</Cat>
    </Analysis>
    <Analysis Type="Analysis2">
      <Cat>Category1</Cat>
    </Analysis>
  </Analyses>
  <Definitions>
    <AttDef Type="Definition1" Label="Definition1" BaseType="" Version="0" Unique="true">
      <ItemDefinitions>
        <Double Name="d1" Label="Double 1:" Version="0" NumberOfRequiredValues="1" Units="d1Units">
          <Categories>
            <Cat>Category1</Cat>
          </Categories>
        </Double>
      </ItemDefinitions>
    </AttDef>
    <AttDef Type="Definition2" Label="Definition2" BaseType="" Version="0" Unique="true">
      <ItemDefinitions>
        <String Name="s2" Label="String 2:" Version="0" NumberOfRequiredValues="1">
          <Categories>
            <Cat>Category2</Cat>
          </Categories>
        </String>
        <Double Name="d2" Label="Double 2:" Version="0" NumberOfRequiredValues="1" Units="d2Units">
          <Categories>
            <Cat>Category1</Cat>
          </Categories>
        </Double>
      </ItemDefinitions>
    </AttDef>
  </Definitions>
  <Attributes>
    <Att Name="Definition1" Type="Definition1">
      <Items>
        <Double Name="d1">1.234</Double>
      </Items>
    </Att>
    <Att Name="Definition2" Type="Definition2">
      <Items>
        <Double Name="d2">3.333</Double>
        <String Name="s2">Hello World</String>
      </Items>
    </Att>
  </Attributes>
  <Views>
    <View Type="Group" Title="SimBuilder" TopLevel="true">
      <DefaultColor>1., 1., 0.5, 1.</DefaultColor>
      <InvalidColor>1, 0.5, 0.5, 1</InvalidColor>
      <Views>
        <View Title="Tab1" />
        <View Title="Tab2" />
      </Views>
    </View>
    <View Type="Instanced" Title="Tab1">
      <InstancedAttributes>
        <Att Name="Tab1" Type="Definition1" />
      </InstancedAttributes>
    </View>
    <View Type="Attribute" Title="Tab2"  >
      <AttributeTypes>
        <Att Name="Tab2" Type="Definition2" />
      </AttributeTypes>
    </View>
  </Views>
</SMTK_AttributeResource>
