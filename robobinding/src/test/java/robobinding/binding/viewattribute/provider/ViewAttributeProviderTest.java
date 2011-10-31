/**
 * Copyright 2011 Cheng Wei, Robert Taylor
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions
 * and limitations under the License.
 */
package robobinding.binding.viewattribute.provider;

import java.util.List;

import org.junit.runner.RunWith;

import robobinding.binding.viewattribute.EnabledAttribute;
import robobinding.binding.viewattribute.OnClickAttribute;
import robobinding.binding.viewattribute.VisibilityAttribute;
import android.view.View;

import com.xtremelabs.robolectric.RobolectricTestRunner;

/**
 *
 * @since 1.0
 * @version $Revision: 1.0 $
 * @author Robert Taylor
 */
@RunWith(RobolectricTestRunner.class)
public class ViewAttributeProviderTest extends AbstractAttributeProviderTest<View>
{
	@Override
	protected AbstractBindingAttributeProvider<View> getBindingAttributeProvider()
	{
		return new ViewAttributeProvider();
	}

	@Override
	protected View getView()
	{
		return new View(null);
	}

	@Override
	protected void populateAttributeClassMappings(List<AttributeClassMapping> attributeClassMappings)
	{
		attributeClassMappings.add(new AttributeClassMapping("visibility", VisibilityAttribute.class));
		attributeClassMappings.add(new AttributeClassMapping("enabled", EnabledAttribute.class));
		attributeClassMappings.add(new AttributeClassMapping("onClick", OnClickAttribute.class));
	}
}
